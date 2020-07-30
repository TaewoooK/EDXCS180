public class Prime {
    public static void main(String[] args) {
        System.out.println(isPrime(81));
    }

    static boolean isPrime(int x) {
        boolean factor = true;
        for (int i = 2; i < x; i++)
            if (x % i == 0)
                factor = false;
        return factor;
    }
}