class NumberWrapper {
    int value;

    NumberWrapper(int value) {
        this.value = value;
    }
}

public class Swapper {
    public static void main(String[] args) {
        NumberWrapper num1 = new NumberWrapper(5);
        NumberWrapper num2 = new NumberWrapper(10);

        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1.value);
        System.out.println("num2 = " + num2.value);

        swapNumbers(num1, num2);

        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1.value);
        System.out.println("num2 = " + num2.value);
    }

    public static void swapNumbers(NumberWrapper a, NumberWrapper b) {
        int temp = a.value;
        a.value = b.value;
        b.value = temp;
    }
}

