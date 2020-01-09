package OOP.lab7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();
        GeometricBody sphere = new Sphere(10);
        GeometricBody cube = new Cube(23);
        GeometricBody parallelepiped = new Parallelepiped(2, 6, 10);
        geometricBodies.add(sphere);
        geometricBodies.add(cube);
        geometricBodies.add(parallelepiped);
        System.out.println("Geometric body with the biggest surface is:" + GeometricBodyController.getTheBiggestSurface(geometricBodies));
        System.out.println("Geometric body with the biggest volume  is:" + GeometricBodyController.getTheBiggestVolume(geometricBodies));

    }
}
