package be.multimedi.jsp.bmi;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/BMI", name = "BMI")
public class BmiServlet extends HttpServlet {
    BmiService service;

    @Override
    public void init() throws ServletException {
        service = new BmiServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/bmi/BMI.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double weight = Double.parseDouble(req.getParameter("weight"));
        double height = Double.parseDouble(req.getParameter("height"));

        Bmi bmi = new Bmi();
        bmi.setHeight(height);
        bmi.setWeight(weight);

        double bmiValue = service.calculateBmi(bmi);

        req.setAttribute("bmiObject", bmi);
        req.setAttribute("bmiValue", bmiValue);

        doGet(req, resp);
    }
}
