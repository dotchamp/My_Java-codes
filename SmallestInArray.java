public class SmallestInArray {
    public static int smallest_value(int numbers[]){
        int largest = Integer.MAX_VALUE;
        for(int i = 0;  i < numbers.length; i++){
            if(numbers[i] < largest){
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
       int numbers[] = {1,2,4,53,4,58,5,4,4,43,54};
       int largest =  smallest_value(numbers);
       System.out.println("smallest number is array  is : "+largest);
    }
}
