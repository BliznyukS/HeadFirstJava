package chapter11;

public class TestExeptions {
    public static void main(String[] args) {
        String test = "no";

        try {
            System.out.println("Start try");
            doRisky(test);
            System.out.println("End try");
        }
        catch (ScaryExeption se){
            System.out.println("Scary Exeption !");
        }
        finally {
            System.out.println("Finally");
        }
        System.out.println("End main");

    }

    static void doRisky(String test)throws ScaryExeption{
        System.out.println("Start Scary method");
        if ("no".equals(test)){
            throw new ScaryExeption();
        }
        System.out.println("End Scary method");
        return;

    }
}
