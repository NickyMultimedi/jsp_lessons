package be.multimedi.jsp.bmi;

public class BmiServiceImpl implements BmiService {
    @Override
    public double calculateBmi(double height, double weight) {
        return weight / (height * height);
    }
}
