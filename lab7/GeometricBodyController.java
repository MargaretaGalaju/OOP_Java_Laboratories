package OOP.lab7;

import java.util.ArrayList;

public class GeometricBodyController {

    public static GeometricBody getTheBiggestVolume(ArrayList<GeometricBody> geometricBodies) {
        GeometricBody biggestVolumeBody = geometricBodies.get(0);
        for (int i = 1; i < geometricBodies.size(); i++) {
            if (biggestVolumeBody.getVolume() < geometricBodies.get(i).getVolume()) {
                biggestVolumeBody = geometricBodies.get(i);
            }
        }
        return biggestVolumeBody;
    }

    public static GeometricBody getTheBiggestSurface(ArrayList<GeometricBody> geometricBodies) {
        GeometricBody biggestSurfaceBody = geometricBodies.get(0);
        for (int i = 1; i < geometricBodies.size(); i++) {
            if (biggestSurfaceBody.getSurface() < geometricBodies.get(i).getSurface()) {
                biggestSurfaceBody = geometricBodies.get(i);
            }
        }
        return biggestSurfaceBody;
    }

}


