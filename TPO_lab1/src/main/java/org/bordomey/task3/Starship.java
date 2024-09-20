package org.bordomey.task3;

public class Starship {
    Machine engine;

    public Starship(Machine uiMachine) {
        engine = uiMachine;
    }

    public boolean isFastEnough(){
        return  engine.getComplexity()>10;
    }
}
