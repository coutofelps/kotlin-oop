fun introArray() {
    val ages: IntArray = intArrayOf(25, 19, 33, 20, 55, 40)

    // Encontrando o mais velho
    var olderAge = 0

    for(age in ages) {
        if(age > olderAge) {
            olderAge = age
        }
    }

    println(olderAge)

    // Encontrando o mais novo
    var lessAge = Int.MAX_VALUE

    ages.forEach { age ->
        if(age < lessAge)
            lessAge = age
    }

    println(lessAge)
}