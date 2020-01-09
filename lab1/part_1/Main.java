package OOP.lab1.part_1;

class Main {

    public static void main(String[] args) {

        Monitor monitor1 = new Monitor();
        monitor1.color = "negru";
        monitor1.dimension = 16.5f;
        monitor1.screenHeight = 1080;
        monitor1.screenWidth = 1920;

        System.out.println("Monitorul 1:");
        System.out.println("Culoarea: " + monitor1.color);
        System.out.println("Dimensiunea:  " + monitor1.dimension);
        System.out.println("Rezolutia: " + monitor1.screenWidth + "x" + monitor1.screenHeight);
        System.out.println(" ");

        Monitor monitor2 = new Monitor();
        monitor2.color = "albastru";
        monitor2.dimension = 19f;
        monitor2.screenHeight = 768;
        monitor2.screenWidth = 1366;

        System.out.println("Monitorul 2:");
        System.out.println("Culoarea " + monitor2.color);
        System.out.println("Dimensiunea: " + monitor2.dimension);
        System.out.println("Reszolutia: " + monitor2.screenWidth + "x" + monitor2.screenHeight);
        System.out.println(" ");

        Comparing comparingDimensions = new Comparing();
        if (comparingDimensions.compareDimensions(monitor1, monitor2)) {
            System.out.println("Monitorul 1, cu dimensiunile " + monitor1.dimension + " este mai mare ca monitorul 2, cu dimensiunile" + monitor2.dimension);
        } else
            System.out.println("Monitorul 2 cu dimensiunile " + monitor2.dimension + " este mai mare ca monitorul 1 cu dimensiunle " + monitor1.dimension);

        Comparing comparingResolutions = new Comparing();
        if (comparingResolutions.compareResolution(monitor1, monitor2, monitor1, monitor2)) {
            System.out.println("Rezolutia monitorului 1 (" + monitor1.screenWidth + "x" + monitor1.screenWidth + "), e mai mare ca rezolutia monitorului 2 (" + monitor2.screenHeight + "x" + monitor2.screenWidth + ").");
        }
    }


}

