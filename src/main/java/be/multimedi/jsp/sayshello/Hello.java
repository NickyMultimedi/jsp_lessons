package be.multimedi.jsp.sayshello;

import java.io.Serializable;

public class Hello implements Serializable {
    private String name;

    public Hello() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
