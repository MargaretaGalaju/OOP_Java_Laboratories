package OOP.lab5.advanced;

public class A {

    protected String a = "a";

    protected X x = new X("XXX");

    protected A(X x){
        System.out.println(a);
        this.x = x;
    }
}
