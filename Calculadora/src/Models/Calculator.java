package Models;

import Services.Operation;

public class Calculator {
    private Operation operation;

    public Calculator(Operation operation) {
        this.operation = operation;
    }

    public double calculate(double num1, double num2) {
        return operation.operation(num1, num2);
    }
}
