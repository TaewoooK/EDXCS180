package RobotObject;

/**
 * Robot
 */
public class Robot {

    String name;

    Robot(String name) {
        this.name = name;
    }

    void speak(String say) {
        System.out.println(say + name);
    }

    void getName() {
        System.out.println(name);
    }
}