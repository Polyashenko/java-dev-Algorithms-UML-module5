public class Dynamic {
    public static int dynamicProgrammingFibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] dp = new int[n];
        dp[0] = 0;
        dp[1] = 1;

        for (int i = 2; i < n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println("Fibonacci(" + n + ") = " + dynamicProgrammingFibonacci(n));
    }
}


