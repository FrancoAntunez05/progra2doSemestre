public class Fibonacci {
    public static int fibonacciIterativo (int n) {
        int e1 = 1;
        int e2 = 1;
        int e3;
        for (int i = 1; i < n ; i++) {
            e3 = e1 + e2;
            e1 = e2;
            e2 = e3;
        }
        return (e1);
    }
    
}
