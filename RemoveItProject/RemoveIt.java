package RemoveItProject;

public class RemoveIt {

    String sentence;

    RemoveIt(String sentence) {
        this.sentence = sentence;
    }

    String removeString(String remove) {
        int removeLen = remove.length();
        int firstInstance = sentence.indexOf(remove);

        String newWord = sentence.substring(0, firstInstance);
        newWord += sentence.substring(firstInstance + removeLen);

        return newWord;
    }

}