package AllAboutMe;

public class AboutMe {

    String name, school;
    int age;

    AboutMe(String name, String school, int age) {
        this.name = name;
        this.school = school;
        this.age = age;
    }

    String getName() {
        return name;
    }

    String getSchool() {
        return school;
    }

    int getAge() {
        return age;
    }

}