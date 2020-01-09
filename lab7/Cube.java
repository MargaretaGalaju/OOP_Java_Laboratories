package OOP.lab7;

public class Cube implements GeometricBody {
    private double length;

    Cube(double length) {
        this.length = length;
    }

    public double getVolume() {
        return 6 * Math.pow(length, 2);
    }

    public double getSurface() {
        return Math.pow(length, 3);
    }

    @Override
    public String toString() {
        return "Cube with volume " + getVolume() + " and with " + getSurface() + " surface";
    }

}
