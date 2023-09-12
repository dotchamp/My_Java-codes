import java.util.Scanner;
public class PreOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number to check");
        int a = sc.nextInt();
        int[] array = {1,22,3,4,5,6,7};
        boolean ispresent = false;
        for (int elements : array){
            if(a == elements){
                 ispresent = true;
      break;
            }
    
          }
              if(ispresent){
            System.out.println("present");
          }else{
            System.out.println("absent");
        }
        sc.close();
    }
}

