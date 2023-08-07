package Models;

import Services.Operation;

public class Division implements Operation {
    @Override
    public double operation(double num1, double num2) {
        if (num2 != 0)
            return num1 / num2;
        else
            throw new ArithmeticException("Cannot divide by zero");
    }
}
