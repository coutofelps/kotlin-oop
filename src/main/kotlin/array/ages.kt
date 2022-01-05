fun ages() {
    val ages: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    // Encontrando o mais velho
    val olderAge = ages.maxOrNull()
    println(olderAge)

    // Encontrando o mais novo
    val lessAge = ages.minOrNull()
    println(lessAge)

    // Encontrando a média de idade
    val averageAge = ages.average()
    println(averageAge)

    // Verificando se todos são maiores de idade
    val ageVerification = ages.all { it >= 18 }
    println(ageVerification)

    // Verificando se pelo menos uma pessoa é maior de idade
    val oneOlderThan18 = ages.any { it >= 18 }
    println(oneOlderThan18)

    // Montando lista com todas as idades maiores que 18
    val ageFilter = ages.filter{ it >= 18 }
    println(ageFilter)

    // Encontrando um valor específico (caso hajam outros valores iguais, retorna o primeiro valor igual a 18)
    val findAge = ages.filter { it == 18}
    println(findAge)
}