package Abstract;

public class Circle extends Shape {
    public int radius;
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
    public double area() {
        return Math.PI * radius * radius;
    }
}

