package Models;

import Services.Shape;

public abstract class ShapeBase implements Shape {
    @Override
    public double calculateArea() {
        return 0.0;
    }

    @Override
    public double calculatePerimeter() {
        return 0.0;
    }
}
