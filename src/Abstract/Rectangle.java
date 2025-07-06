package Abstract;

public class Rectangle extends Shape {
    public int length;
    public int breath;
    public double perimeter() {
        return 2 * length * breath;
    }
    public double area() {
        return length * breath;
    }
}
