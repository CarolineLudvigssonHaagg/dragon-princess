package org.example;

public class Horse implements Item {

    private final String type = "Horse";
    private String name = "";
    private boolean found = false;

    public Horse() {
    }

    @Override
    public String getType() {
        return type;
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
    public void updateFound(boolean found) {
        this.found = found;
    }

    @Override
    public boolean hasBeenFound() {
        return found;
    }
}
