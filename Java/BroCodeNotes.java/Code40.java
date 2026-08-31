// July 27, 2025

public class Code40 {
    public static void main(String[] args) {
    
        // Constructor = special method to initialize an object
                /* You can pass arguments to a constructor 
                and set up initial values */

        Student student1 = new Student("Tom", 97, 4.6); // creates a new Student object
        Student student2 = new Student("Matt", 34, 2.3);
        Student student3 = new Student("Ricky", 27, 3.5);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);

        System.out.println(student2.name);
        System.out.println(student2.age);
        System.out.println(student2.gpa);
        System.out.println(student2.isEnrolled);

        System.out.println(student3.name);
        System.out.println(student3.age);
        System.out.println(student3.gpa);
        System.out.println(student3.isEnrolled);

        student1.study();
        student2.study();
        student3.study();
    }
}

class Student { // new class attributes

    String name;
    int age;
    double gpa;
    boolean isEnrolled;

    // Constructor is called when creating a new object
    Student(String name, int age, double gpa) { // This is the constructor
        this.name = name; // 'this.' assigns attributes. Current object
        this.age = age;
        this.gpa = gpa;
        this.isEnrolled = true;
    }

    void study(){
        System.out.println(this.name + " is studying.");
    }
}