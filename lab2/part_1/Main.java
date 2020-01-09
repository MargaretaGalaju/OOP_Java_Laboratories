package OOP.lab2.part_1;

public class Main {
    public static void main(String[] args) {

        //Default constructor
        Boxes box1 = new Boxes();

        //One parameter constructor
        Boxes box2 = new Boxes(5);

        //Three parameters constructor
        Boxes box3 = new Boxes(6, 7, 8);


        System.out.println(box1.calculateArea()+" "+box1.calculateV());
        System.out.println(box2.calculateArea()+" "+box2.calculateV());
        System.out.println(box3.calculateArea()+" "+box3.calculateV());
    }


}

