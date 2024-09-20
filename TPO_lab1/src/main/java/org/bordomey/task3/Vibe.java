package org.bordomey.task3;

public enum Vibe {
    HAPPY("весело"),
    NEUTRAL("нейтрально"),
    SAD("мрачно");

    private final String name;

    Vibe(String name){
        this.name=name;
    }

    public java.lang.String getName() {
        return name;
    }
}
