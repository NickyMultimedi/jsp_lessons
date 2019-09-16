package be.multimedi.jsp.sayshello;

public class HelloServiceImpl implements HelloService {
    @Override
    public void handleHello(Hello hello) {
        System.out.println("handling " + hello.getName());
    }
}
