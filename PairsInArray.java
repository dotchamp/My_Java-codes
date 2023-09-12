public class PairsInArray {
    public static void pairsInArray(int numbers[]){
        int total_Pairs = 0;
        for(int i = 0; i < numbers.length; i++){
            int curr = numbers[i];
            for(int j = i+1; j < numbers.length; j++){
                System.out.print("(" + curr + "," + numbers[j] + ") ");
                total_Pairs ++;
            }
            System.out.println();
        }
          System.out.println("total pairs: " + total_Pairs);
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,4,5,6,7,8,9};
        pairsInArray(numbers);
    }
}
