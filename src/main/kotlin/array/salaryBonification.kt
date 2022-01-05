fun salaryBonification() {
    val salaries: DoubleArray = doubleArrayOf(1500.50, 2300.0, 5000.0, 8000.0, 10000.0)
    val bonus = 1.1

    // Adicionando bônus por salário com o índice
    for(index in salaries.indices) {
        salaries[index] = salaries[index] * bonus
    }

    println(salaries.contentToString())

    // Adicionando bônus por salário com índice e salário
    salaries.forEachIndexed { i, salary ->
        salaries[i] = salary * bonus
    }

    println(salaries.contentToString())
}