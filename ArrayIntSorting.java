import java.util.Scanner;

public class ArrayIntSorting {
    //take input for array and display the array
   public static int[] takeInput(){
         Scanner sc = new Scanner(System.in);
         System.out.println("enter number of values: ");
        int a = sc.nextInt();
         int numbers[] = new int[a];
        System.out.println("enter values for array: ");
        for(int i=0; i<a; i++){
           numbers[i] = sc.nextInt();
        }
        System.out.println("your array is: ");
        for(int elements: numbers){
            System.out.print(elements+" ");  
            sc.close();
        }
        return numbers;
    }

    //sorting of array
    public static void sortArray(int numbers[]){
        int size = numbers.length;
    for(int i = 0; i < size - 1; i++){
        for(int j = i+1; j < size ; j++){
            if(numbers[i] > numbers[j]){
                int temp = numbers[i];
                numbers [i] = numbers[j];
                numbers[j] = temp;
            }
        }
    }
}

    public static void main(String[] args) {
        int numbers[] = takeInput();
        sortArray(numbers);
        System.out.print("\n\nafter sorting: \n");
        for(int elements: numbers){
            System.out.print(elements+" ");
        }
    }
}
