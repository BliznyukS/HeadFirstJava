package chapter02.movie;

public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "How to lose";
        one.genre = "Tragedy";
        one.rating = -2;

        Movie two = new Movie();
        two.title = "Lost in Office";
        two.genre = "Comedy";
        two.rating = 5;
        two.playIt();

        Movie three = new Movie();
        three.title = "Byte-club";
        //System.out.println(three.title);
        three.genre = "Tragedy but fun";
        three.rating = 127;

    }
}
