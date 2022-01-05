import java.math.BigDecimal
import java.math.RoundingMode

fun salaryWithBigDecimal() {
    // Construindo um array BigDecimal
    // Criar com strings é mais indicados devido ao problema de arredondamento do tipo Double
    val salaries = bigDecimalArrayOf("1500.55", "2000.0", "5000.0", "10000.0")

    println(salaries.contentToString())

    // A função map mapeia o array de salários originais para um novo array com os salários + bônus
    val bonus = "1.1".toBigDecimal()
    val salariesWithBonus: Array<BigDecimal> = salaries
        .map { salary -> relativeIncreaseCalc(salary, bonus) }
        .toTypedArray()

    println(salariesWithBonus.contentToString())

    // Calculando o gasto inicial
    val initialBudget = salariesWithBonus.somatory()

    println(initialBudget)

    // Calculando gasto nos primeiros seis meses
    val monthNumber = 6.toBigDecimal()

    val totalBudget = salariesWithBonus.fold(initialBudget) { accumulator, salaries ->
        accumulator + (salaries * monthNumber).setScale(2, RoundingMode.UP)
    }

    println(totalBudget)

    // Calculando média dos três últimos salários
    val average = salariesWithBonus.sorted().takeLast(3).toTypedArray().average()
    println(average)

    // Calculando a média dos três menos salários
    val lessSalariesAverage = salariesWithBonus.sorted().take(3).toTypedArray().average()
    println(lessSalariesAverage)
}

private fun relativeIncreaseCalc(salary: BigDecimal, bonus: BigDecimal): BigDecimal {
    return if(salary < "5000".toBigDecimal()) {
        salary + "500".toBigDecimal()
    }

    else {
        (salary * bonus).setScale(2, RoundingMode.UP)
    }
}

// O tipo varag é utilizado para passar argumentos variáveis para uma função (podemos passar um, dois, três valores)
fun bigDecimalArrayOf(vararg values: String): Array<BigDecimal> {
    return Array<BigDecimal>(values.size) { i ->
        values[i].toBigDecimal()
    }
}

// Criando uma extension function de somatória
fun Array<BigDecimal>.somatory(): BigDecimal {
    // O reduce reduz o valor para um valor só, somando o accumulator (inicialmente zero) com cada elemento iterado em value, passando por todos os elementos
    return this.reduce {accumulator, value ->
        accumulator + value
    }
}

// Criando uma extension function para cálculo de média
fun Array<BigDecimal>.average(): BigDecimal {
    return if(this.isEmpty()) {
       BigDecimal.ZERO
    }

    else {
        this.somatory() / this.size.toBigDecimal()
    }
}