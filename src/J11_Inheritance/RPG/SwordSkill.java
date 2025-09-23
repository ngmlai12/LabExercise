package J11_Inheritance.RPG;

public class SwordSkill extends Skill{
    private double missRate;
    private int combos;

    public SwordSkill(String name, int damage, int mpUsage, double missRate, int combos) {
        super(name, damage, mpUsage);
        this.missRate = missRate;
        this.combos = combos;
    }

    public String toString(){
        return "[Sword] Skill: "+getName()
                +" - damage="+getDamage()
                +", mpUsage="+getMpUsage()
                +", missRate="+missRate
                +", combos: "+combos;
    }

    public boolean useSkill(){
        if(judgement(missRate)) {
            System.out.print("Sword Skill, " + getName() + "! ");
            for(int i = 0; i < combos; i++) {
                System.out.print("shiiing! ");
            }
            System.out.println();
            return true;
        }else {
            System.out.println("Sword Skill, " + getName() + "! Miss...");
            return false;
        }
    }
}
