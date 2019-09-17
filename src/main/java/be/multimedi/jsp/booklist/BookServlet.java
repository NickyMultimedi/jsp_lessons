package be.multimedi.jsp.booklist;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(value = "/BookList", name = "BookList")
public class BookServlet extends HttpServlet {
    BookRepository repo = new BookRepositoryMemoryImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String isbn = req.getParameter("ISBN");

        if (isbn == null) {
            List<Book> books = repo.getAllBooks();
            req.setAttribute("BOOKS", books);
            req.getRequestDispatcher("/WEB-INF/pages/book/BookList.jsp").forward(req, resp);
        }
        else {
            Book book = repo.getBookByIsbn(isbn);
            req.setAttribute("BOOK", book);
            req.getRequestDispatcher("/WEB-INF/pages/book/BookDetails.jsp").forward(req, resp);
        }
    }
}
