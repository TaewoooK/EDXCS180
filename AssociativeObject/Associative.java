package AssociativeObject;

public class Associative {
    int x, y, z;

    Associative(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    int firstTwo() {
        return (x+y)*z;
    }

    int lastTwo() {
        return x+y*z;
    }
}