public class Triangle {

    double a, b, c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public Triangle() {
        a = 0;
        b = 0;
        c = 0;
    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double triangleArea(double a, double b, double c) {
        double area;
        area = a * b * c;

        return area;
    }

    public double trianglePerimetr(double a, double b, double c) {
        double perimetr;
        perimetr = a + b + c;

        return perimetr;
    }
}
