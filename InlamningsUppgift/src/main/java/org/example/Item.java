package org.example;

public interface Item {
    String getType();

    void setName(String name);
    String getName();

    void updateFound(boolean found);
    boolean hasBeenFound();
}
