public class KadanesAlgorithm {
    public static int smallest_value(int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0;  i < numbers.length; i++){
            if(numbers[i] < smallest){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void kadanes(int nums[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0; i<nums.length; i++){
            currSum = currSum + nums[i];
            if(currSum < 0){
                currSum = 0;
            }if(maxSum>0){
            maxSum = Math.max(currSum, maxSum);
            }else{
                maxSum = smallest_value(nums);
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int numbers[] = {5,-4,-2};
        kadanes(numbers);
    }
}
