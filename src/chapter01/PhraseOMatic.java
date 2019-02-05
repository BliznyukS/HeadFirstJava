package chapter01;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"круглосуточный", "трех-звёздный", "30000-футовый", "взаимный", "умный", "шесть"};
        String[] wordListTwo = {"трудный", "фирменный", "сетевой", "общий", "совместный", "ускоренный", "распределенный"};
        String[] wordListThree = {"обзор", "легко", "портал", "талант", "подход"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Всё, что вам нужно, - это " + phrase);
        //System.out.println("Всё, что вам нужно, - это " + phrase);
    }
}
