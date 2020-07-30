package EmailGeneratorProject;

public class EmailGenerator {

    String makeUserName(String fName, String lName) {

        int totalChars = fName.length() + lName.length();

        if (totalChars < 8)
            for (int i = 0; i < (8-totalChars); i++)
                lName = lName + "x";

        if (lName.length() > 7)
            return ("" + fName.substring(0, 1) + lName.substring(0, 7)).toLowerCase();

        if (lName.length() < 7)
            return ("" + fName.substring(0, (8-lName.length())) + lName).toLowerCase();

        return ("" + fName.substring(0, 1) + lName).toLowerCase();
    }

    String makeEmail(String userName, String domain) {
        return "" + userName + "@" + domain;
    }
}