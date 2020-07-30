import java.util.Scanner;

/**
 * RegionsProject
 */
public class RegionsProject {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Type in a two letter abbreviation of a State: ");
        System.out.println(getRegion(input.nextLine()));

    }

    static String getRegion(String state) {

        if (state.equals("ME") || state.equals("VT") || state.equals("NH") || state.equals("MA") || state.equals("CT")
                || state.equals("RI"))
            return "The state " + state + " is in the Midwest region";
        else if (state.equals("NY") || state.equals("NJ") || state.equals("DE") || state.equals("MD")
                || state.equals("VA") || state.equals("NC") || state.equals("SC"))
            return "The state " + state + " is in the Atlantic region";
        else if (state.equals("GA") || state.equals("FL") || state.equals("MS") || state.equals("AL")
                || state.equals("LA") || state.equals("TN"))
            return "The state " + state + " is in the Southeast region";
        else if (state.equals("PA") || state.equals("OH") || state.equals("MI") || state.equals("IN")
                || state.equals("IL") || state.equals("WI") || state.equals("MN") || state.equals("KY")
                || state.equals("WV") || state.equals("IA"))
            return "The state " + state + " is in the Midwest region";
        else if (state.equals("ND") || state.equals("SD") || state.equals("KS") || state.equals("NE")
                || state.equals("MO"))
            return "The state " + state + " is in the Great Plains region";
        else
            return "The state entered is not valid.";
    }
}