public class Triangle extends Shape {
    double base;
    double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double GetArea() {
        return 0.5 * base * height;
    }

}
