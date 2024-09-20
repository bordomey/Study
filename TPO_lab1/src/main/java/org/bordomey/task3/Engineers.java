package org.bordomey.task3;

public class Engineers {
    private boolean weak;
    private int iq;
    private Vibe vibe;
    public Engineers(boolean weak, int iq){
        this.weak = weak;
        this.iq = iq;
    }
    public boolean canBuild(Machine machine){
        if(machine.getComplexity()<=this.iq)
            return true;
        else
            return false;
    }
    public String describeProgress(Machine machine) {
        if (estimateProbability(machine) > 0.75) {
            vibe = Vibe.HAPPY;
        } else if (estimateProbability(machine) > 0.40) {
            vibe = Vibe.NEUTRAL;
        } else
            vibe = Vibe.SAD;
        return "Инженеры " + vibe.getName() + " сообщили о прогрессе";
    }
    public double estimateProbability(Machine machine){
        return (double) this.iq / machine.getComplexity();
    }
    public boolean canGiveUp(){
        return weak;
    }
}
