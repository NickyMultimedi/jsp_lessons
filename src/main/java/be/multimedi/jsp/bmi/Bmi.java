package be.multimedi.jsp.bmi;

import java.io.Serializable;
import java.util.Objects;

public class Bmi implements Serializable {
    private double weight;
    private double height;

    public Bmi() {
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBmiValue() {
        return weight / Math.pow(height, 2);
    }

    @Override
    public String toString() {
        return "Bmi{" +
                "weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bmi bmi = (Bmi) o;
        return Double.compare(bmi.getWeight(), getWeight()) == 0 &&
                Double.compare(bmi.getHeight(), getHeight()) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getWeight(), getHeight());
    }
}
