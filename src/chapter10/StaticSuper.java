package chapter10;

public class StaticSuper {

    static {
        System.out.println("Super static block");
    }

    StaticSuper(){
        System.out.println("Super constructor");
    }
}
