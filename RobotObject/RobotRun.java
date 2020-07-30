package RobotObject;

/**
 * RobotRun
 */
public class RobotRun {
    public static void main(String[] args) {

        Robot r = new Robot("Eddie");
        r.speak("My name is... ");
        r.getName();

        Robot b = new Robot("Dylan");
        b.speak("My name is... ");
        b.getName();
    }
}