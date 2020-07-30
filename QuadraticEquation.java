import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Quadratic Equation Calculator");
        System.out.print("a: ");
        double a = input.nextDouble();
        System.out.print("b: ");
        double b = input.nextDouble();
        System.out.print("c: ");
        double c = input.nextDouble();

        System.out.println();

        System.out.println(a + "x^2 + " + b + "x + " + c);

        Quadratic(a, b, c);
        
        System.out.println();
    }

    static void Quadratic (double a, double b, double c) {

        double imaginary = (b*b) - (4.0*a*c);

        if (imaginary < 0) {
            System.out.println("Imaginary roots");
            return;
        }

        double plusRoots = ((-1.0*b) + Math.sqrt(imaginary)) / (2.0*a);
        double minusRoots = ((-1.0*b) - Math.sqrt(imaginary)) / (2.0*a);

        System.out.println("x = " + plusRoots + ", x = " + minusRoots);
        
    }
}