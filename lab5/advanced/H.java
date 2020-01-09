package OOP.lab5.advanced;
public class H extends G {
    protected String h = "h";

    private X x = new X("XXXH");

    protected H(X x){

        super(x);
        System.out.println(h);
    }
}
