package list

data class Shelf(
    val type: String,
    val books: List<Book>
) {
    fun sortByAuthor(): List<Book> {
        return books.sortedBy{ it.author } // A função sortedBy (não confundir com sortBy do tipo MutableList) retorna uma nova lista de livros ordenada pelas instruções que a enviamos
    }

    fun sortByPubYear(): List<Book> {
        return books.sortedBy{ it.pubYear }
    }
}
