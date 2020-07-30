package AssociativeObject;

import java.util.Scanner;

/**
 * AssociativeRun
 */
public class AssociativeRun {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in 3 numbers: ");
        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        Associative a = new Associative(x, y, z);

        System.out.println("Grouping the first two terms, (" + x + " + " + y + ") * " + z + " = " + a.firstTwo());
        System.out.println("Grouping the last two terms, " + x + " + (" + y + " * " + z + ")" + " = " + a.lastTwo());
    }
}