package be.multimedi.jsp.booklist;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepositoryMemoryImpl implements BookRepository {
    private Map<String, Book> books = new HashMap<>();

    public BookRepositoryMemoryImpl() {
        books.put("0545139708", new Book("0545139708", "Harry Potter and the Deathly Hallows", "J.K. Rowling", 15));
        books.put("0385504225", new Book("0385504225", "The Lost Symbol", "Dan Brown", 18));
        books.put("015603297X", new Book("015603297X", "Foucault's Pendulum", "Umberto Eco", 12));
    }

    @Override
    public Book getBookByIsbn(String isbn) {
        return books.get(isbn);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<Book>(books.values());
    }
}
