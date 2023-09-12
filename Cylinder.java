
class Cylind{
    double radius;
    double height;
   
  public double get_radius(){
        return radius;
    }
  public void set_radius(int a){
        this.radius = a;
    }
  public  double get_height(){
        return height;
    }
 
  public void set_height(int b){
        this.height = b;
    }
    public double SurArea(){
        double volume = 3.14 * radius * radius * height;
        return volume;
    }

}
public class Cylinder {
    public static void main(String[] args) {
        Cylind cd = new Cylind();
        cd.set_height(2);
        cd.set_radius(2);
        //  System.out.println(cd.get_height());
        // System.out.println(cd.get_radius());
        System.out.println(cd.SurArea());
        
    }
}
