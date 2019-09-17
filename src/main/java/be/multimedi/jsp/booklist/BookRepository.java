package be.multimedi.jsp.booklist;

import java.util.List;

public interface BookRepository {
    Book getBookByIsbn(String isbn);
    List<Book> getAllBooks();
}
