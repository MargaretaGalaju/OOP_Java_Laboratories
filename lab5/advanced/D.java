package OOP.lab5.advanced;

public class D extends C {
    protected String d = "d";

    protected X x = new X("XXXD");

    protected D(X x){
        super(x);
        System.out.println(d);
    }
}
