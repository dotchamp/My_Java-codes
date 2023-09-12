

class First_method{
    public int add(int a , int b){
        return a + b;
    }
}
    class Second_extend extends First_method{
        int sub(int a, int b){
            return a - b;
        }
    }

public class Calculator{
    public static void main(String[] args) {
        Second_extend sd = new Second_extend();
       
        System.out.println(sd.add(5,4));
       
        
    }
}