abstract class Shape {
    int dim1, dim2;

    
    Shape(int dim1, int dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    
    abstract void printArea();
}


class Rectangle extends Shape {

    
    Rectangle(int length, int breadth) {
        super(length, breadth);
    }

    
    @Override
    void printArea() {
        int area = dim1 * dim2;
        System.out.println("Area of Rectangle: " + area);
    }
}

class Triangle extends Shape {

    // Constructor for Triangle
    Triangle(int base, int height) {
        super(base, height);
    }

    
    @Override
    void printArea() {
        double area = 0.5 * dim1 * dim2;
        System.out.println("Area of Triangle: " + area);
    }
}


class Circle extends Shape {

    
    Circle(int radius) {
        super(radius, 0);
    }

    
    @Override
    void printArea() {
        double area = Math.PI * dim1 * dim1;
        System.out.println("Area of Circle: " + area);
    }
}


public class Shapes {
    public static void main(String[] args) {
        
        Shape rectangle = new Rectangle(10, 5);
        Shape triangle = new Triangle(10, 5);
        Shape circle = new Circle(7);

        
        rectangle.printArea();
        triangle.printArea();
        circle.printArea();
    }
}
