package LabJ06_Object.Gameee;

public class Avatar {
    int level = 1;
    boolean isAlive;
    int currentHp = 100;
    int maxHP = 100;
    int currentMp = 50;
    int maxMp = 50;



    public void deployMagicAttack() {
        currentMp -= 20;
        System.out.println("Spell: Abracadabra.");
    }

    public void receivedDamage(int damage) {
        currentHp -= damage;
        if (currentHp <= 0) {
            isAlive = false;
        }
        System.out.println("Received Damage: " + damage);
    }

    public void levelUp() {
        level++;
        maxHP+=20;
        maxMp+=20;
        currentMp=maxMp;
        currentHp=maxHP;
        System.out.println("Level Up!!! The current level becomes " + level);
    }

    public void heal(int hp, int mp) {
        currentMp+=mp;
        currentHp+=hp;
        System.out.println("Healed HP "+hp+", MP + "+mp);
    }

    public void avatarStatus(String name) {
        System.out.println(name +"-HP: " + currentHp + "/" + maxHP + ", MP: " + currentMp + "/" + maxMp);
    }
}
