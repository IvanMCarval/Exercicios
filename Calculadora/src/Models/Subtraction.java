package Models;

import Services.Operation;

public class Subtraction implements Operation {
    @Override
    public double operation(double num1, double num2) {
        return num1 - num2;
    }
}
