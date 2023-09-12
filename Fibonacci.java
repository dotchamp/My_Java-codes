public class Fibonacci {
    public static void main(String[] args) {
        nthFibonacci(10);
    }

    static void nthFibonacci(int n) {
        int prev = 0;
        int curr = 1;
        int temp;

        if (n == 1) {
            System.out.println(prev);
        } else if (n == 2) {
            System.out.println(prev);
            System.out.println(curr);
        } else {
            System.out.println(prev);
            System.out.println(curr);
            for (int i = 3; i <= n; i++) {
                temp = curr + prev;
                System.out.println(temp);
                prev = curr;
                curr = temp;
            }
        }
    }
}
