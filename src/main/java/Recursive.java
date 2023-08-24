public class Recursive {
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Fibonacci(" + n + ") = " + recursiveFibonacci(n));
    }
}
