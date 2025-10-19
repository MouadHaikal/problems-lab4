package problem6;

public class Circle extends Forme {
    private double radius;

    public Circle(double r) {
        this.radius = r;
    }

    @Override
    public double getSurface() {
        return radius * radius * Math.PI;
    }

    @Override
    public String toString() {
        return String.format("Square (radius %.2f cm)", radius);
    }
}
