package be.multimedi.jsp.sayshello;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value="/HelloMVC", name = "HelloMVC")
public class HelloServlet extends HttpServlet {
    private HelloService service = new HelloServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/sayshello/HelloForm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Hello hello = new Hello();
        hello.setName(req.getParameter("name"));
        service.handleHello(hello);
        req.setAttribute("hello", hello);
        req.getRequestDispatcher("/WEB-INF/pages/sayshello/HelloResult.jsp").forward(req, resp);
    }
}
