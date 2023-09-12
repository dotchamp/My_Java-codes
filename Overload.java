class load{
    public int add(int a, int b){
        return a + b;
    }
    public float add(float a, int b, int c){
        return a + b + c;
    }
    public load(){
        System.out.println("lets do addition");
    }
    public load(int a){
        System.out.println("what is addition");
    }
}
public class Overload {
    public static void main(String[] args) {
        load ov = new load();
      System.out.println(  ov.add(3.5f,5,4));
        
    }
}
