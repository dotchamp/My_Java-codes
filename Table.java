import java.util.Scanner;
public class Table {
public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           System.out.println("Enter a number: ");
           int a = sc.nextInt();
           for (int i = 1; i<=10; i++){
            System.out.format("%d X %d = %d ",a,i,a*i);
            System.out.println();
           }
           sc.close();
    }
}
