package org.example;

import java.util.ArrayList;
public class GameData {
    // GLOBALA VARIABLER
    private Sword sword;
    private Horse horse;
    private Army army;
    private boolean youAreDead = false;
    private boolean wonTheGame = false;

    // CONSTRUCTOR
    public GameData() {
        this.sword = new Sword();
        this.horse = new Horse();
        this.army = new Army();
    }
    //FUNCTIONS
    public boolean foundAllItems()  {
        if(!sword.hasBeenFound() || !horse.hasBeenFound() || !army.hasBeenFound()) {
            return false;
        }
        return true;
    }

    public ArrayList<Item> getAllItems() {
        ArrayList<Item> itemList = new ArrayList<>();
        itemList.add(sword);
        itemList.add(horse);
        itemList.add(army);
        return itemList;
    }


    //GETTERS & SETTERS

    public Sword getSword() {
        return sword;
    }
    public Horse getHorse() {
        return horse;
    }
    public Army getArmy() {
        return army;
    }

    public void setSwordName(String swordName) {
        this.sword.updateFound(true);
        this.sword.setName(swordName);
    }

    public void setHorseName(String horseName) {
        this.horse.updateFound(true);
        this.horse.setName(horseName);
    }

    public void setArmyName(String armyName) {
        this.army.updateFound(true);
        this.army.setName(armyName);
    }

    public void setYouAreDead(boolean youAreDead) {
        this.youAreDead = youAreDead;
    }

    public void setWonTheGame(boolean wonTheGame) {
        this.wonTheGame = wonTheGame;
    }

    public boolean didILoose() {
        return youAreDead;
    }

    public boolean didIWin() {
        return wonTheGame;
    }
}

