import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers [] = new int[50];
        numbers[0] = sc.nextInt();
        numbers[1] = sc.nextInt();
        numbers[3] = sc.nextInt();
        numbers[5] = sc.nextInt();
        numbers[7] = sc.nextInt();
      for(int elements:numbers){
        System.out.println(elements);
      }
      sc.close();
    }
}
