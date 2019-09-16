package be.multimedi.jsp.address;

public class AddressServiceImpl implements AddressService {
    @Override
    public void registerAddress(AddressBean address) {
        System.out.println(address);
    }
}
