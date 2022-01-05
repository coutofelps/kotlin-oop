package list

fun nullableBookList() {
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

    // Criando uma nullable list de Livros
    val nullableBookList: MutableList<Book?> = mutableListOf(bookOne, bookTwo, bookThree, null, bookFour, null)

    nullableBookList.show()
}