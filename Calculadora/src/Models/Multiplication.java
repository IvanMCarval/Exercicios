package Models;

import Services.Operation;

public class Multiplication implements Operation {
    @Override
    public double operation(double num1, double num2) {
        return num1 * num2;
    }
}
