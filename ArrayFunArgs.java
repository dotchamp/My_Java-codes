public class ArrayFunArgs {
    public static void func(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
    public static void main(String[] args) {
       int  marks[] = {5,6,7,7,8};
       func(marks);
        
       // print array
       for(int elements : marks){
        System.out.println(elements);
       }
       System.out.println();
    }
}
