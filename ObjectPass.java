class Student {
    private String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ObjectPass {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 20);

        System.out.println("Before calling method: ");
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());

        // Passing the student object to a method and getting a modified object back
        Student modifiedStudent = modifyStudent(student1);

        System.out.println("\nAfter calling method: ");
        System.out.println("Name: " + modifiedStudent.getName());
        System.out.println("Age: " + modifiedStudent.getAge());
    }

    public static Student modifyStudent(Student student) {
        // Creating a new Student object with modified data
        Student newStudent = new Student(student.getName(), student.getAge() + 1);

        // Modifying the original object (not recommended, just for demonstration purposes)
        student.age += 2;

        return newStudent; // Returning the new object
    }
}
