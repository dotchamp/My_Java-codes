class Student{
    String Name = "Ganesh";
    int Roll = 071;
    int DC = 50;
    int EME = 54;
    int DBMS = 45;
    int FJP = 47;

}

public class Information {
    public static void main(String[] args) {
        Student s = new Student();
        System.out.println("Your name is: " + s.Name);
        System.out.println("Your roll no is : " + s.Roll);
        System.out.println("Your DC marks are : " +s.DC);
        System.out.println("Your EME marks are : "+s.EME);
        System.out.println("Your DBMS marks are : "+s.DBMS);
        System.out.println("Your FJP marks are : "+s.FJP);
    }
}
