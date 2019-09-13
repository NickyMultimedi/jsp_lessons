package be.multimedi.jsp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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