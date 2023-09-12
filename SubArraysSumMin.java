public class SubArraysSumMin {
    public static void printSubArraysSum(int numbers[]){
        int currSum = 0;
        int maxSum = Integer.MAX_VALUE;
        for(int i=0; i<numbers.length; i++){
            //int start = i;
            currSum = 0;
            for(int j=i; j<numbers.length; j++){
                //int end = j;
                for(int k=i; k<=j; k++){
                    currSum += numbers[k];
                }
                System.out.println(currSum);
                if(maxSum > currSum){
                    maxSum = currSum;
                }
            }
            System.out.println();
        }
        System.out.println("max sum is: "+maxSum);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        printSubArraysSum(nums);
    }
}