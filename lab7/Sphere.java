package OOP.lab7;

public class Sphere implements GeometricBody {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    public double getVolume() {
        return 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    public double getSurface() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Sphere with volume " + getVolume() + " and with " + getSurface() + " surface";
    }

}
