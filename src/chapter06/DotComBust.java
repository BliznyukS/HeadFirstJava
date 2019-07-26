package chapter06;

import chapter05.simpleGame.GameHelper;

import java.util.ArrayList;

public class DotComBust {
    private GameHelper helper = new GameHelper();
    private ArrayList<DotCom> dotComsList = new ArrayList<DotCom>();
    private int numOfGuesses = 0;

    private void setUpGame () {

        DotCom one = new DotCom();
        one.setName("Pets.com");
        DotCom two = new DotCom();
        one.setName("eToys.com");
        DotCom three = new DotCom();
        one.setName("Go2.com");

        dotComsList.add(one);
        dotComsList.add(two);
        dotComsList.add(three);

        System.out.println("Ваша цель - потопить 3 сайта");
        System.out.println("Pets.com, eToys.com, Go2.com");
        System.out.println("Попытайтесь потопить их за миннимальное количество ходов");

        for (DotCom dotComToSet : dotComsList){
            ArrayList<String> newLocation = helper.placeDotCom(3);
            dotComToSet.setLocationCells(newLocation);
        }
    }

    private void startPlaying() {

        while (!dotComsList.isEmpty()){
            String userGuess = helper.getUserInput("Сделайте свой ход");
            checkUserGuess (userGuess);
        }
        finishGame();
    }

    private void checkUserGuess(String userGuess){

        numOfGuesses++;
        String result = "Мимо";


    }

    private void finishGame(){

    }
}
