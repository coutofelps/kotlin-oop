fun range() {
    val serie: IntRange = 1.rangeTo(10)

    // Criando uma série de 1 até 100
    for(s in serie) {
        // println(s)
    }

    // Criando série com syntax sugar
    val pairNumbers = 2.until(100) step 2

    for(pairNumber in pairNumbers) {
        // println(pairNumber)
    }

    // Criando série com step reverso
    val reversePairNumbers = 100 downTo 0 step 2

    reversePairNumbers.forEach {
        // println(it)
    }

    // Verificando se o valor está no range
    val interval = 1500.0..5000.0
    val salary = 4000.0

    if(salary in interval) {
        println("O salário está no intervalo especificado.")
    }

    else {
        println("O salário não está no intervalo especificado.")
    }

    // Verificando range com letras
    val letters = 'a'..'z'
    val letter = 'A'

    println(letter in letters)
}