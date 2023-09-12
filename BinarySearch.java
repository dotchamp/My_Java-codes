public class BinarySearch {
    public static int binary_search(int numbers[], int key){
        int start = 0, end = numbers.length - 1; 
        while(start <= end){
            int mid = (start + end) / 2;

            //comparison
              if(numbers[mid] == key){
                return mid;
            }
            if( numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {1,3,5,7,8,12,14,25,67};
        int key = 7;
        int index = binary_search(numbers, key);
        if(index == -1){
            System.out.println("key not found");
        }else{
        System.out.println("key found at index : "+index);
        }
    }
}
