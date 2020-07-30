package EmailGeneratorProject;

import java.util.Scanner;

public class EmailGeneratorRun {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Type in your first name: ");
        String fName = input.nextLine();
        System.out.print("Type in your last name: ");
        String lName = input.nextLine();

        EmailGenerator emailGenerator = new EmailGenerator();

        System.out.println("This user's email is: "
                + emailGenerator.makeEmail(emailGenerator.makeUserName(fName, lName), "purdue.edu"));
        

    }
}