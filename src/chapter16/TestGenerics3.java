package chapter16;

import java.util.ArrayList;

public class TestGenerics3 {

    public static void main(String[] args) {
        new TestGenerics3().go();
    }

    private void go() {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Dog());
        animals.add(new Cat());
        animals.add(new Dog());

        takeAnimals(animals);
    }

    private void takeAnimals(ArrayList<? extends Animal> animals) {

        for (Animal a : animals) {
            a.eat();
        }
    }
}
