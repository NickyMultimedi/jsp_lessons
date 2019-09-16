package be.multimedi.jsp.address;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Address", value = "/Address")
public class AddressServlet extends HttpServlet {
    AddressBean address;
    AddressService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/pages/address/AddressForm.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        address = new AddressBean();
        address.setName(req.getParameter("naam"));
        address.setLastName(req.getParameter("achternaam"));
        address.setStreet(req.getParameter("straat"));
        address.setNumber(Integer.parseInt(req.getParameter("huisnummer")));
        address.setPostalCode(req.getParameter("postcode"));
        address.setDistrict(req.getParameter("gemeente"));
        address.setCountry(req.getParameter("land"));
        address.setTelephone(req.getParameter("telefoon"));
        address.setEmail(req.getParameter("email"));

        service.registerAddress(address);

        req.setAttribute("address", address);

        req.getRequestDispatcher("/WEB-INF/pages/address/AddressResult.jsp").forward(req, resp);
    }
}
