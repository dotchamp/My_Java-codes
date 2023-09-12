import java.util.Scanner;
public class Palindrome{
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int palindrome = sc.nextInt();
        if(isPalindrome(palindrome)){
            System.out.println("it is palindrome");
        }else{
            System.out.println("is not palindrome");
        }
          sc.close();
    }
    public static boolean isPalindrome(int n){
        int palindrome = n;
        int reverse = 0;
        while(palindrome != 0){
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome /= 10;
        }
        if( n == reverse){
            return true;
        }
        return false;
    }
}
