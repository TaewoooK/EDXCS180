package RewardsProject;

import java.util.Scanner;

public class Rewards {

    private int points;
    private Scanner input = new Scanner(System.in);

    Rewards() {
        points = 300;
    }

    String showRewards() {
        return "Option  Points  Reward\n1       50      free coffee\n2       100     free baked good\n3       200     free specialty coffee\n4       5000    1% store ownership";
    }

    String getReward() {
        System.out.println("Which reward option would you like: ");
        int option = input.nextInt();
        if (option == 1) {
            if (points > 50){
                points -= 50;
                return "You have selected free coffee";
            }
            return "You do not have enough points for this award";
        }
        if (option == 2) {
            if (points > 100){
                points -= 100;
                return "You have selected free baked good";
            }
            return "You do not have enough points for this award";
        }
        if (option == 3) {
            if (points > 200){
                points -= 200;
                return "You have selected free specialty coffee";
            }
            return "You do not have enough points for this award";
        }
        if (option == 4) {
            if (points > 5000){
                points -= 5000;
                return "You have selected 1% store ownership";
            }
            return "You do not have enough points for this award";
        }
        return "Option not avaliable";
    }

}