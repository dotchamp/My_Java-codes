import java.util.*;


public class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            generateAndPrintSeries(a, b, n);
        }
        in.close();
    }
      private static void generateAndPrintSeries(int a, int b, int n) {
        int term = a;
        for (int i = 0; i < n; i++) {
            term += (int) Math.pow(2, i) * b;
            System.out.print(term + " ");
        }
}
}