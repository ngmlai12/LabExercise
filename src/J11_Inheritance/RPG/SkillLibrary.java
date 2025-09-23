package J11_Inheritance.RPG;

public class SkillLibrary {
    public static void main(String[] args) {

        Skill[] skills = {
                new SwordSkill("Horizontal", 20, 5, 0.5, 1),
                new SwordSkill("Horizontal Sqaure", 80, 15, 0.4, 4),
                new SwordSkill("Star Burst Stream", 600, 120, 0.3, 16),
                new MagicalSkill("Fireball", 50, 8, 0.3),
                new MagicalSkill("Explosion", 850, 90, 0.5)};

        System.out.println("Skill List (Count: " + skills.length + "): ");
        for (int i = 0; i < skills.length; i++) {
            System.out.println(skills[i]);
        }

        System.out.println("Using skills:");
        for (int i = 0; i < skills.length; i++) {
            if (skills[i] instanceof SwordSkill swordSkill) {
                swordSkill.useSkill();
            } else if (skills[i] instanceof MagicalSkill magicalSkill) {
                magicalSkill.useSkill();
            }
        }
    }
}
