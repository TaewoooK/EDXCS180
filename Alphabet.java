
public class Alphabet {
    public static void main(String[] args) {
        System.out.println(whatsMissing("hello darkness my old friend"));
    }

    static String whatsMissing(String word) {

        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < word.length(); i++) {
            for (int j = 0; j < alphabet.length(); j++) {
                if (word.charAt(i) == alphabet.charAt(j)) {
                    alphabet = alphabet.substring(0, j) + alphabet.substring(j + 1);
                }
            }
        }
        return alphabet;
    }
}