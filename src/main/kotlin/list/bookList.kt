package list

fun bookList() {
    val bookOne = Book(
        title = "Grande Sertão: Veredas",
        author = "João Guimarães Rosa",
        pubYear = 1956
    )

    val bookTwo = Book(
        title = "Minha Vida de Menina",
        author = "Helena Morley",
        pubYear = 1942,
        pubCompany = "Companhia da Letras"
    )

    val bookThree = Book(
        title = "Memórias Póstumas de Brás Cubas",
        author = "Machado de Assis",
        pubYear = 1881
    )

    val bookFour = Book(
        title = "Iracema",
        author = "José de Alencar",
        pubYear = 1865,
        pubCompany = "Editora Rocco"
    )

    // Agrupando todos os livros em uma só lista
    val books: MutableList<Book> = mutableListOf(bookOne, bookTwo, bookThree, bookFour)

    // Adicionando um novo livro na lista mutável
    books.add(
        Book(
            title = "Sagarana",
            author = "João de Moraes Rosa",
            pubYear = 1946,
            pubCompany = "Editora Universal"
        )
    )

    // books.show()

    // Removendo um livro
    // books.remove(bookOne)
    // books.show()

    // Ordenando a lista de livros com a função sorted
    val orderByPublishYear: List<Book> = books.sorted()
    // orderByPublishYear.show()

    // Ordenando a lista de livros com a função sortedBy
    val orderByTitle = books.sortedBy { it.author }
    // orderByTitle.show()

    // Filtrando livros por autor específico
    val filterBooksByName = books
        .filter { it.author.startsWith("Machado") }
        .sortedBy { it.pubYear }

    // filterBooksByName.show()

    // Filtrando livros e exibindo seus títulos de acordo com o prefixo (primeira letra ou conjunto de letras) do autor
    val booksTitles: List<String> = books
        .filter { it.author.startsWith("J") }
        .sortedBy { it.pubYear }
        .map{ it.title }

    // println(booksTitles)
}

// Criando uma extension function que percorre a lista, concatena todos os títulos e autores formatados em uma única variável e depois a exibe
fun List<Book?>.show() {
    val formattedText = this
        .filterNotNull() // Esta função impede que se uma propriedade que não pode ser nula está nula, então ignoraremos o item da lista
        .joinToString(separator = "\n") {
        " - ${it.title} de ${it.author} - Publicado em ${it.pubYear}" // Ao utilizar it?.title, estamos fazendo uma safecall para chamar parâmetros quando não forem nulos
    }

    println("\n ### Lista de Livros ### \n")
    println("${formattedText}")
}