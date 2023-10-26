package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    //GLOBALA VARIABLER
    GameData gameData = new GameData();

    //CONSTRUCTOR
    public Game() {

    }
    //FUNCTIONS
    public void startGame() {
        System.out.println("Your princess is kidnapped, gather your stuff and allies and travel to the dangerous dragon!");
        Scanner gameScanner = new Scanner(System.in);
        while(gameData.didIWin() == false && gameData.didILoose() == false) {
            System.out.println("You have four choices:");
            System.out.println("Press 1: Go to the smith");
            System.out.println("Press 2: Go to the stall");
            System.out.println("Press 3: Go to the guard house");
            System.out.println("Press 4: Go to the dragon");
            try {
                int input = Integer.parseInt(gameScanner.nextLine());
                switch (input) {
                    case 1:
                        goToTheSmith();
                        break;
                    case 2:
                        goToTheStall();
                        break;
                    case 3:
                        goToTheGuardHouse();
                        break;
                    case 4:
                        goToTheDragon();
                        break;
                    default:
                        System.out.println("Invalid option");
                }
            } catch (Exception e) {
                System.out.println("Invalid option");
            }
        }
    }

    private void goToTheSmith() {
        if(gameData.getSword().hasBeenFound()) {
            System.out.println("You have already picked up your sword, " + gameData.getSword().getName());
            return;
        }
        System.out.println("You went to the smith and picked up an ancient sword.");
        System.out.println("What is the name of this new found sword?");
        Scanner swordScanner = new Scanner(System.in);
        gameData.setSwordName(swordScanner.nextLine());
        System.out.println("You feel the courage rising with your sword, " + gameData.getSword().getName());
    }

    public void goToTheStall() {
        if(gameData.getHorse().hasBeenFound()) {
            System.out.println("You have already picked up your horse, " + gameData.getHorse().getName());
            return;
        }
        System.out.println("You went to the stall and saw a powerful horse.");
        System.out.println("What is the name of this horse?");
        Scanner horseScanner = new Scanner(System.in);
        gameData.setHorseName(horseScanner.nextLine());
        System.out.println("Congratulations to your new horse, " + gameData.getHorse().getName() + "!");
    }
    public void goToTheGuardHouse() {
        if(gameData.getArmy().hasBeenFound()) {
            System.out.println("You have already recruited your army, " + gameData.getArmy().getName());
            return;
        }
        System.out.println("You went to the guard house and held a speech for the people.");
        System.out.println("Your speech gave success and you gathered yourself a ten men army.");
        System.out.println("What did you name your army?");
        Scanner armyScanner = new Scanner(System.in);
        gameData.setArmyName(armyScanner.nextLine());
        System.out.println("Wow, you wil definitely win a fight with an army like the " + gameData.getArmy().getName() + "!");
    }

    public void goToTheDragon() {
        if(!gameData.foundAllItems()) {
            System.out.println("You haven't picked up everything needed to kill the dragon, you have two choices.");
            System.out.println("1: Try to slay the dragon anyway");
            System.out.println("2: Talk to the dragon");
            Scanner newScanner = new Scanner(System.in);
            try {
                int choice = Integer.parseInt(newScanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println(slayTheDragon());
                        break;
                    case 2:
                        System.out.println(talkToTheDragon());
                        break;
                    default:
                        System.out.println("Invalid option");
                        gameData.setYouAreDead(true);
                        System.out.println("You did not listen to the instructions the dragon ate you anyway. You lost the game");
                        break;
                }
            } catch(Exception e) {
                System.out.println("Invalid option");
                gameData.setYouAreDead(true);
                System.out.println("You did not listen to the instructions the dragon ate you anyway. You lost the game");
            }
        } else {
            gameData.setWonTheGame(true);
            System.out.println("You have slaughtered the dragon with your sword " + gameData.getSword().getName() +
                    ", riding your horse " + gameData.getHorse().getName() + " and with help from your army " + gameData.getArmy().getName() +
                    ". You won the game!");
        }
    }

    private String talkToTheDragon() {
        System.out.println("You start a conversation with the dragon and he responds with a riddle.");
        System.out.println("If your answer is correct, you may leave with the princess");
        System.out.println("otherwise the dragon will eat you.");
        System.out.println("THE RIDDLE");
        System.out.println("What has keys but can't open locks?");
        Scanner newScanner2 = new Scanner(System.in);
        String answer = newScanner2.nextLine();
        if(answer.toLowerCase().equals("piano")) {
            gameData.setWonTheGame(true);
            return "The answer is correct, you may leave with your princess. You won the game!";
        }
        gameData.setYouAreDead(true);
        return "The answer is incorrect, it should have been piano. The dragon ate you and you lost the game..";
    }

    private String slayTheDragon() {
        String text = "You had ";
        ArrayList<Item> allItems = gameData.getAllItems();
        for(Item item : allItems) {
            if(!item.hasBeenFound()) {
                text = text + "no " + item.getType() + " ";
            }
        }
        gameData.setYouAreDead(true);
        return text + "the dragon ate you alive, you lost the game";
    }
}

