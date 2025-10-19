package problem6;

public class Square extends Forme {
    private double len;

    public Square(double len) {
        this.len = len;
    }

    @Override
    public double getSurface() {
        return len * len;
    }

    @Override
    public String toString() {
        return String.format("Square (side %.2f cm)", len);
    }
}
