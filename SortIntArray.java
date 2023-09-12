public class SortIntArray {
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
        int numbers[] = {2,3,5,1,7,3,1,67,8};
        sortArray(numbers);
        for(int elements : numbers){
            System.out.print(elements+" ");
        }
        
    }
}
