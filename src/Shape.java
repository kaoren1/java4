abstract class Shape {
    public abstract double S();
    public abstract double P();
}

class Square extends Shape {
    private double a;
    public Square(double a)
    {
        this.a = a;
    }
    @Override
    public double S() {
        return a * a;
    }
    @Override
    public double P() {
        return 4 * a;
    }
}

class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    private double h;

    public Triangle(double a, double b, double c, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    public double S() {
        return (a * h)/2;
    }

    @Override
    public double P() {
        return a + b + c;
    }
}