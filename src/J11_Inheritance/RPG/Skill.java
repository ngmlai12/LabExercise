package J11_Inheritance.RPG;

public class Skill {
    private static int count = 0;
    private String name;
    private int damage;
    private int mpUsage;

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getMpUsage() {
        return mpUsage;
    }


    public Skill(String name, int damage, int mpUsage) {
        this.name = name;
        this.damage = damage;
        this.mpUsage = mpUsage;
        count++;
    }

    protected boolean judgement(double rate) {
        return Math.random() > rate;
    }

}
