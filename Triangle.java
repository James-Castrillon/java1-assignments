public class Triangle {
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getArea() {
        return 0.5 * base * height;
    }

    public void printInfo() {
        System.out.printf("Base: %.2f%n", base);
        System.out.printf("Height: %.2f%n", height);
        System.out.printf("Area: %.2f%n", getArea());
    }
}
