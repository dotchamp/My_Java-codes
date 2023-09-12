public class SortStringArray {
    public static void sortArray(String myArray[]){
           int size = myArray.length;

      for(int i = 0; i<size-1; i++) {
         for (int j = i+1; j<size; j++) {
            if(myArray[i].compareTo(myArray[j])>0) {
               String temp = myArray[i];
               myArray[i] = myArray[j];
               myArray[j] = temp;
            }
         }
      }
    }
   public static void main(String args[]) {
      String[] myArray = {"JavaFX", "HBase", "OpenCV", "Java", "Hadoop", "Neo4j"};
    sortArray(myArray);
    for(String elements: myArray){
        System.out.println(elements);
    }
   }
}