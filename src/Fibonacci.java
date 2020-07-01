public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(oddSumFibonacci(10000));
    }

    private static int oddSumFibonacci(int n) {
        int res = 0;
        if (n > 1) {
            res++;
            int n0 = 0, n1 = 1;
            int nextElement = 0;
            for (int i = 2; nextElement < n; i++) {
                nextElement = n0 + n1;
                n0 = n1;
                n1 = nextElement;
                if (nextElement % 2 != 0) {
                    res += nextElement;
                }
            }
        }
        return res;
    }
}
