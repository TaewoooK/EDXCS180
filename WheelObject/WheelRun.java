package WheelObject;

import java.util.Scanner;

public class WheelRun {
    public static void main(String[] args) {
        Scanner inputRadius = new Scanner(System.in);

        System.out.print("Please type in a real number: ");
        double radius = inputRadius.nextDouble();

        Wheel w = new Wheel(radius);
        System.out.println(w.getCircumference());
        System.out.println(w.getArea());
        
    }
}