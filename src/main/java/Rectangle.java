public class Rectangle {

    double a, b;

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

    public Rectangle() {
        double a = 0;
        double b = 0;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double rectangleArea(double a, double b) {
        if(a > 0 & b > 0) {
            double area;
            area = a * b;
            return area;
        } else {
            throw new NullPointerException("Некорректное значение одного из параметров");
        }
    }

    public double rectanglePerimetr(double a, double b) {
        double perimetr;
        perimetr = 2 * (a + b);

        return perimetr;
    }
}
