import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter number to get factorial : ");
     int a = sc.nextInt();
     int fact = 1;
     for(int i = 1; i<=a; i++){
        fact *= i;
     }
     System.out.println(fact);
     sc.close();
    }
}
