package org.example;

public class Sword implements Item  {
    //Sätter till final för att den aldrig ska bli uppdaterad
    private final String type = "Sword";
    private String name = "";
    private boolean found = false;

    public Sword() {
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void updateFound(boolean found) {
        this.found = found;
    }

    @Override
    public boolean hasBeenFound() {
        return found;
    }
}
