import java.util.Scanner;

public class NumSystemCalculator {
  public static void choice(){
        Scanner sc = new Scanner(System.in);
    System.out.println("enter choice: ");
    System.out.println("1 for binary to decimal: ");
    System.out.println("2 for decimal to binary: ");
    System.out.println("3 for palindrome: ");
    System.out.println("4 to reverse number:");
    int a = sc.nextInt();
    switch(a){
        case 1: 
        public static void binToDec(a){
            int myNum = a;
            int pow = 0;
            int decNum = 0;
            while(binNum > 0){
                int lastDigit = binNum % 10;
                decNum = decNum + (lastDigit * (int)Math.pow(2,pow));
                pow ++;
                binNum = binNum/10;
    
            }
            System.out.println("decimal of  "+myNum+" is "+decNum);
    
        };
    }
  }


    public static void main(String[] args) {
        
    }
}
