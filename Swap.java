import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Type in two values: ");

        int x = input.nextInt();
        int y = input.nextInt();

        System.out.println("x = " + x + "\ny = " + y);

        if (y < x) { 
            System.out.println("y is less than x");
            int temp = x;
            x = y;
            y = temp;
            System.out.println("x = " + x + "\ny = " + y);
        }
    }
}