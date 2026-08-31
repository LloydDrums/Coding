// July 29, 2025

public class Code48 {
    public static void main(String[] args) {

        // Abstract defines abstract classes (implemented) & 'concrete' methods (inherited)
        /* Hides implementation details showing only the features
            They CAN'T be instantiated directly */

        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4, 5);
        Rectangle rectangle = new Rectangle(6, 7);

        System.out.println(circle.area());
        System.out.println(triangle.area());
        System.out.println(rectangle.area());
    }
}

abstract class Shape {

    abstract double area(); // Abstract

    void display(){ // Concrete
        System.out.println("This is a shape");
    }
}

class Circle extends Shape { // child of shape class

    double radius;

    Circle (double radius){
        this.radius = radius;
    }

    @Override
    double area (){
        return Math.PI * radius * radius;
    }
}

class Triangle extends Shape {

    double base;
    double height;

    Triangle(double base, double height){
        this.base = base;
        this.height = height;
    }

    @Override
    double area (){
        return 0.5 * base * height;
        }
}

class Rectangle extends Shape {

    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area (){
        return length * width;
    }
}