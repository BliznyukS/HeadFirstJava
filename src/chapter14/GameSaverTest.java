package chapter14;

import java.io.*;

public class GameSaverTest {

    public static void main(String[] args) {

        GameCharacter one = new GameCharacter(50, "Elf", new String[]{"Bow", "Sword", "Knuckles"});
        GameCharacter two = new GameCharacter(200, "Troll", new String[]{"Hands", "Great Axe"});
        GameCharacter three = new GameCharacter(120, "Wizard", new String[]{"Spells", "Invisibility"});

        try {
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("Game.ser"));
            os.writeObject(one);
            os.writeObject(two);
            os.writeObject(three);
            os.close();

        } catch (IOException ex) {
            ex.printStackTrace();
        }

        one = null;
        two = null;
        three = null;

        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
            GameCharacter oneRestore = (GameCharacter) is.readObject();
            GameCharacter twoRestore = (GameCharacter) is.readObject();
            GameCharacter threeRestore = (GameCharacter) is.readObject();

            System.out.println("First character : " + oneRestore.getType() + " " + oneRestore.getPower() + " " + oneRestore.getWeapons());
            System.out.println("Second character : " + twoRestore.getType() + " " + twoRestore.getPower() + " " + twoRestore.getWeapons());
            System.out.println("Third character : " + threeRestore.getType() + " " + threeRestore.getPower() + " " + threeRestore.getWeapons());

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
