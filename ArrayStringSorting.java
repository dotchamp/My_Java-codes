import java.util.Scanner;

public class ArrayStringSorting {
   public static String[] takeInput(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter number of values: ");
        int a = sc.nextInt();
         String numbers[] = new String[a];
        System.out.println("enter values for array: ");
        for(int i=0; i<a; i++){
           numbers[i] = sc.next();
        }
        System.out.println("your array is: ");
        for(String elements: numbers){
            System.out.print(elements+" ");  
            sc.close();
        }
        return numbers;
    }
    public static void sortArray(String numbers[]){
        int size = numbers.length;
    for(int i = 0; i < size - 1; i++){
        for(int j = i+1; j < size ; j++){
            if(numbers[i].compareTo(numbers[j])>0){
                String temp = numbers[i];
                numbers [i] = numbers[j];
                numbers[j] = temp;
            }
        }
    }
}
    public static void main(String[] args) {
        String numbers[] = takeInput();
        sortArray(numbers);
        System.out.print("\n\nafter sorting: \n");
        for(String elements: numbers){
            System.out.print(elements+" ");
        }
    }
}
