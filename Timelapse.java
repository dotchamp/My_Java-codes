 class Date{
    int day;
    int month;
    int year;

    public Date(int d, int m, int y){
        day = d;
        month = m;
        year = y;
    }
    public void display(){
        System.out.println("Date : dd/mm/yyyy : "+day+"/"+month+"/"+year);
    }
}

public class Timelapse {
    public static void main(String[] args) {
        Date d = new Date(29,8,2003);
     d.display();
    }
}
