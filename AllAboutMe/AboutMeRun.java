package AllAboutMe;

import java.util.Scanner;

public class AboutMeRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Type in your name: ");
        String name = input.nextLine();

        System.out.print("Type in your school: ");
        String school = input.nextLine();

        System.out.print("Type in your age: ");
        int age = input.nextInt();

        AboutMe me = new AboutMe(name, school, age);

        System.out.println("My name is " + me.getName() + ", I attend " + me.getSchool() + ". I am " + me.getAge()
                + " years old.");
    }
}