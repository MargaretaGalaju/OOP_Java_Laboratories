package OOP.lab5.advanced;

public class C extends B {
    protected String c = "c";

    protected C(X x){
        super(x);
        System.out.println(c);
    }
}
