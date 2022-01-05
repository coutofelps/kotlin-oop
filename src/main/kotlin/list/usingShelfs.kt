package list

fun usingShelfs() {
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

    // Colocando os livros em uma prateleira
    val shelf = Shelf(type = "Literatura", books = books)

    // Ordenando por autor
    val orderByAuthor = shelf.sortByAuthor()

    // Ordenando por ano de publicação
    val orderByPubYear = shelf.sortByPubYear()

    // Estamos ordenando o mesmo objeto duas vezes, portanto, esta pratica não é recomendada ao se utilizar uma MutableList

    // Como agora modificamos nossa classe Shelf para receber apenas o tipo List como parâmetro de entrada na propriedade books,
    // podemos reordenar o mesmo objeto (shelf) duas vezes que criaremos uma nova lista a cada reordenação feita (observar ordem dos livros listados no console)
    orderByAuthor.show()
    orderByPubYear.show()
}