package J11_Inheritance.RPG;

public class MagicalSkill extends Skill{
    private double failDeploymentRate;

    public MagicalSkill(String name, int damage, int mpUsage, double failDeploymentRate) {
        super(name, damage, mpUsage);
        this.failDeploymentRate = failDeploymentRate;
    }

    public boolean use(){
        return true;
    }

    public String toString(){
        return "[Magical] Skill: "+getName()
                +" - damage="+getDamage()
                +", mpUsage="+getMpUsage()
                +", failDeploymentRate="+failDeploymentRate;
    }

    public boolean useSkill(){
        if(judgement(failDeploymentRate)) {
            System.out.println(getName() + " magic! Abracadabra! Boooom");
            return true;
        }else {
            System.out.println(getName() + " magic! Abracadap... Deployment failed!");
            return false;
        }
    }

}
