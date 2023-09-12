class A{
    public void print(){
        System.out.println("ganesh");
    }
}
    class B extends A{
        @Override
        public void print(){
            System.out.println("ramesh");
        }
        public void print2(){
            System.out.println("suresh");
        }
    }


public class MethodOverride {
    public static void main(String[] args) {
        B b = new B();
        b.print();
        
    }
}
