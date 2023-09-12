public class StringMethod {
    public static void main(String[] args) {
        int [] a = {1,3,4,5,5};
       boolean isPresent = false;
       int b = 70;
        for(int elements: a){
        if(elements == b){
            isPresent = true;
        }
        }
        if(isPresent){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }
       
    }
}
