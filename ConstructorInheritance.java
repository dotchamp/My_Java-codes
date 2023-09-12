class construct{
    construct(){
        System.out.println("i am constructor in base class");
    }
}
class inherit extends construct{
    inherit(){
        System.out.println("i am constructor in derived class");
    }
}

public class ConstructorInheritance {
  public static void main(String[] args) {
      inherit in = new inherit();
    construct cd = new construct();
  }
}
