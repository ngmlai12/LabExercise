package LabJ06_Object.Gameee;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Avatar max = new Avatar();



        max.avatarStatus("Max");
        max.deployMagicAttack();
        max.deployMagicAttack();
        max.receivedDamage(20);
        max.heal(0,50);
        max.deployMagicAttack();
        max.levelUp();
        max.avatarStatus("Max");



    }
}
