class Phone{
    public void showTime(){
        System.out.println("time is 8");
    }
    public void play(){
        System.out.println("playing music in phone");
    }
}
class SmartPhone extends Phone{
    public void turnON(){
        System.out.println("turning on");
    }
    public void play(){
        System.out.println("playing music in smartphone");
    }
}

public class DynamicMethod {
public static void main(String[] args) {
    Phone obj = new SmartPhone();
    obj.play();
    obj.showTime();

}
}
