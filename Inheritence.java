import java.util.Scanner;
class Player{
    String name;
    String skill;
    int age;
}
class Football extends Player{
}
class Hockey extends Player{
}
class Cricket extends Player{
}

public class Inheritence {
    public static void main(String[] args) {
        Football fb = new Football();
        Hockey hk = new Hockey();
        Cricket ck = new Cricket();
        int a, b;
        while(true){
            System.out.println("Select Option: \n 1.Enter Details: \n 2.Show Details: \n 3.Exit");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            switch(a){
                case 1:
                System.out.println("1.Hockey Player \n 2.Football Player \n 3.Cricket Player");
                b = sc.nextInt();
                switch(b){
                case 1:
                System.out.println("Enter details of Hockey player: ");
                System.out.println("Enter name: ");
                hk.name = sc.next();
                System.out.println("Enter skill: ");
                hk.skill = sc.next();
                System.out.println("Enter age: ");
                hk.age = sc.nextInt();

                case 2:
                System.out.println("Enter details of Football player: ");
                System.out.println("Enter name: ");
                fb.name = sc.next();
                System.out.println("Enter skill: ");
                fb.skill = sc.next();
                System.out.println("Enter age: ");
                fb.age = sc.nextInt();

                case 3:
                System.out.println("Enter details of Cricket player: ");
                System.out.println("Enter name: ");
                ck.name = sc.next();
                System.out.println("Enter skill: ");
                ck.skill = sc.next();
                System.out.println("Enter age: ");
                ck.age = sc.nextInt();
                }
                case 2:
                System.out.println("\n\nDetails of players: ");
                System.out.println("Football Player details: ");
                System.out.println("Name is: " + fb.name);
                System.out.println("skill is: " + fb.skill);
                System.out.println("age is: " + fb.age + "\n\n");

                System.out.println("Hockey Player details: ");
                System.out.println("Name is: " + hk.name);
                System.out.println("skill is: " + hk.skill);
                System.out.println("age is: " + hk.age + "\n\n");

                System.out.println("Cricket Player details: ");
                System.out.println("Name is: " + ck.name);
                System.out.println("skill is: " + ck.skill);
                System.out.println("age is: " + ck.age + "\n\n");
                break;
                case 3:
                System.exit(0);
            }
        }
    }
}
