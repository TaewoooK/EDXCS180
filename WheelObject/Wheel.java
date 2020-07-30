package WheelObject;

public class Wheel {

    double radius;

    Wheel(double radius) {
        this.radius = radius;
    }

    double getCircumference() {
        return 2 * Math.PI * radius;
    }

    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

}