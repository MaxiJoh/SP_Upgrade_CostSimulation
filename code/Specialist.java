package code;

public class Specialist {

    private String name;
    private int currentUpgrade;

    public String getName() {
        return name;
    }
    public Specialist setName(String name) {
        this.name = name;
        return this;
    }
    
    public int getCurrentUpgrade() {
        return currentUpgrade;
    }
    public Specialist setCurrentUpgrade(int currentUpgrade) {
        this.currentUpgrade = currentUpgrade;
        return this;
    }
    
}
