package OOP.lab5.basic;

public class H extends G {
    public String h = "h";

    public H(){
        System.out.println(h);
    }
}

class Parinte {

    Parinte(int n) {

    }
}

class Copil extends Parinte {
    Copil(int n) {
        super(n);
    }
}
