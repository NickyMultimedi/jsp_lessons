package be.multimedi.jsp.guestbook;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet(value = "/GuestBook", name = "GuestBook")
public class GuestBookServlet extends HttpServlet {
    GuestBookRepo repo = new MariaDBRepoImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<GuestBookEntry> entries = repo.getAllEntries();

        req.setAttribute("ENTRIES", entries);

        req.getRequestDispatcher("/WEB-INF/pages/GuestBook.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GuestBookEntry entry = new GuestBookEntry();

        entry.setMessage(req.getParameter("message"));
        entry.setName(req.getParameter("name"));
        entry.setDate(LocalDateTime.now());

        if (entry.getMessage() != "" && entry.getName() != "") {
            repo.submitNewEntry(entry);
        } else {
            req.setAttribute("message", entry.getMessage());
            req.setAttribute("name", entry.getName());
        }

        doGet(req, resp);
    }
}
