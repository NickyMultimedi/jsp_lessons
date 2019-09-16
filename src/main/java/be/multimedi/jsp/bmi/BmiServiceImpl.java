package be.multimedi.jsp.bmi;

public class BmiServiceImpl implements BmiService {
    @Override
    public double calculateBmi(Bmi bmi) {
        return bmi.getWeight() / (bmi.getHeight() * bmi.getHeight());
    }
}
