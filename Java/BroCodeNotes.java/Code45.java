// July 29, 2025

public class Code45 {
    public static void main(String[] args) {

        // Super refers to the parent class: subclass <- superclass
        /*  Used in constructors & method overriding 
            Call the parent constructor to initialize attributes */

        Person person = new Person("Murray", "Cook"); // A reference to someone from the Wiggles. They got me into playing drums (and to do music)
        Student student = new Student("Jamie", "Wood", 3.25);
        Employee employee = new Employee("Calvin", "Coolidge", 50000); // quiet president. I like his personality

        employee.showSalary();
    }
}

class Person {
    String first;
    String last;

    Person (String first, String last){
        
        this.first = first;
        this.last = last;
    }

    void showName(){
        System.out.println(this.first  + " " + this.last);
    }
}

class Student extends Person{
    double gpa;

    Student(String first, String last, double gpa){
        super(first, last);
        this.gpa = gpa;
    }

    void showGPA(){
        System.out.println(this.first + " 's gpa is: " + this.gpa);
    }
}

class Employee extends Person {
    int salary;

    public Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary(){
        System.out.println(this.first + " " + this.last + "'s salary is $" + this.salary); // not nessecary to add: " " + this.last
    }
}