package chapter01;


public class Beginning {
    public static void main(String[] args) {
        double d = Math.random();
        double x = Math.random();

        double a = d * x;

        System.out.println(d);
        System.out.println(x);
        System.out.println("  ");
        System.out.println(a);
        System.out.println("  ");

        int z = 1;

        System.out.println("Перед началом цикла");

        while (z < 4) {
            System.out.println("Внутри цикла");
            System.out.println("z равно - " + z);

            z++;
        }
        System.out.println("После окончания цикла");
    }

}