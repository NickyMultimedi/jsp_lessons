package be.multimedi.jsp;

import be.multimedi.jsp.address.AddressBean;
import be.multimedi.jsp.address.AddressService;

class AddressServiceImplTest {
    AddressService service;
    AddressBean address;

    {
        address = new AddressBean(
                "Nick",
                "Bauters",
                "Trekweg",
                94,
                "9030",
                "Mariakerke",
                "België",
                "0483618655",
                "nick.bauters@me.com"
        );
    }

}