package OOP.lab1.part_1;

public class Comparing{
    public boolean compareDimensions(Monitor a, Monitor b){
        return a.dimension > b.dimension;
    }

    public boolean compareResolution(Monitor c, Monitor d, Monitor e, Monitor f){
        return c.screenHeight > d.screenHeight && e.screenWidth > f.screenWidth;
    }

}
