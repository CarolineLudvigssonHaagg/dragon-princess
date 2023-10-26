package org.example;

public class Army implements Item {

    private final String type = "Army";
    private String name = "";
    private boolean found = false;
    public Army() {
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
