package be.multimedi.jsp.address;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class AddressListener implements ServletContextListener {
    public static final String ADDRESS_SERVICE = "addressService";

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        AddressService service = new AddressServiceImpl();
        sce.getServletContext().setAttribute("ADDRESS_SERVICE", service);
    }
}
