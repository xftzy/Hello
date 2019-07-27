public class Solution1 {
    public int Fibonacci(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        if (n < 0) {
            return 0;
        } else if (n == 1 || n == 2) {
            return 1;
        } else {
            for (int i = 3; i < n; i++) {
                c = a + b;
                b = a;
                a = c;
            }
            return c;
        }
    }
}
