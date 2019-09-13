package be.multimedi.jsp;

public class AddressServiceImpl implements AddressService {
    @Override
    public void registerAddress(AddressBean address) {
        System.out.println(address);
    }
}
