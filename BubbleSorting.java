public class BubbleSorting {
    public static  void bubbleSort(int arr[]) {
        int size = arr.length;
         int swap = 0;
        for(int turn=0; turn<size-1; turn++) {
            for(int j=0; j<size-1-turn; j++) {

                if(arr[j] > arr[j+1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println(swap);
    }
    public static void printArr(int arr[]) {
        //print array
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5,2,6,3,8,1,4,7,9,0};
        bubbleSort(arr);
        printArr(arr);
    }
}
