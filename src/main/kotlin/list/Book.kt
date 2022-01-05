package list

data class Book(
    val title: String,
    val author: String,
    val pubYear: Long,
    val pubCompany: String? = null // String ou nulo
): Comparable<Book> {
    // Extendendo a classe Comparable para utilizarmos a função compareTo
    override fun compareTo(other: Book): Int {
        // Ordenando lista de livros por ano de publicação
        return this.pubYear.compareTo(other.pubYear) // Compara o livro atual com o livro recebido por parâmetro
    }
}