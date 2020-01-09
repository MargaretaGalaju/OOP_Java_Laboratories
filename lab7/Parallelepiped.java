package OOP.lab7;

public class Parallelepiped implements GeometricBody {
    private double length;
    private double height;
    private double width;

    Parallelepiped(double length, double height, double width) {
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getVolume() {
        return length * width * height;
    }

    public double getSurface() {
        return 2 * (length * height + width * height + length * width);
    }

    @Override
    public String toString() {
        return "Parallelepiped with volume " + getVolume() + " and with " + getSurface() + " surface";
    }
}
