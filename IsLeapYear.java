import java.util.Scanner;
public class IsLeapYear {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type in a year: ");
        int year = input.nextInt();

        System.out.println("Is it a leap year?, " + isLeapYear(year));

    }
    static boolean isLeapYear(int year) {
        if (year % 4 != 0)
            return false;
        else if (year % 100 == 0){
            if (year % 400 == 0)
                return true;
            return false;
        }
        return true;
    }
}