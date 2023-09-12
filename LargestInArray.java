public class LargestInArray {
    public static int largest_value(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0;  i < numbers.length; i++){
            if(numbers[i] > largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
       int numbers[] = {1,2,4,53,4,58,5,4,4,43,54};
       int largest =  largest_value(numbers);
       System.out.println("largest number is array  is : "+largest);
    }
}
