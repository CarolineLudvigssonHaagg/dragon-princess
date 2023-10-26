package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RiddarData {
    // GLOBALA VARIABLER
    private Sword sword;
    private Horse horse;
    private Army army;
    private boolean youAreDead = false;
    private boolean wonTheGame = false;
    private boolean beenToTheSmith = false;
    private boolean beenToTheStall = false;
    private boolean beenToTheGuardHouse = false;
    Scanner scanner  = new Scanner(System.in);

    // CONSTRUCTOR
    public RiddarData() {
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
    public boolean didILoose() {
        return youAreDead;
    }

    public boolean didIWin() {
        return wonTheGame;
    }

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
        this.sword.setName(swordName);
    }

    public void setHorseName(String horseName) {
        this.horse.setName(horseName);
    }

    public void setArmyName(String armyName) {
        this.army.setName(armyName);
    }

    public boolean isYouAreDead() {
        return youAreDead;
    }

    public void setYouAreDead(boolean youAreDead) {
        this.youAreDead = youAreDead;
    }

    public boolean isWonTheGame() {
        return wonTheGame;
    }

    public void setWonTheGame(boolean wonTheGame) {
        this.wonTheGame = wonTheGame;
    }

    public boolean getBeenToTheSmith() {
        return beenToTheSmith;
    }

    public void setBeenToTheSmith(boolean beenToTheSmith) {
        this.beenToTheSmith = beenToTheSmith;
    }

    public boolean getBeenToTheStall() {
        return beenToTheStall;
    }

    public void setBeenToTheStall(boolean beenToTheStall) {
        this.beenToTheStall = beenToTheStall;
    }

    public boolean getBeenToTheGuardHouse() {
        return beenToTheGuardHouse;
    }

    public void setBeenToTheGuardHouse(boolean beenToTheGuardHouse) {
        this.beenToTheGuardHouse = beenToTheGuardHouse;
    }
}

