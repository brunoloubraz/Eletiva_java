package com.betrybe.rpg;

public class Main {

  public static void main(String[] args) {
    Warrior warrior = new Warrior();
    warrior.setName("Biriro");
    warrior.setRace("Humano");
    warrior.setWeapon("Espada");
    System.out.println(warrior.getName() + " é da raça " + warrior.getRace() + " e utiliza "
        + warrior.getWeapon());
    PlayableCharacter player2 = new Warrior();
    player2.setName("Aragorn");
//    player2.setWeapon('Espada')
    warrior.move();
    warrior.attack();
    Mage mage = new Mage();
    mage.setName("Biriromage");
    mage.move();
    mage.attack();
    moveAndAttack(warrior);
    moveAndAttack(mage);
    Cleric cleric = new Cleric();
    moveAndAttack(cleric);
    Barbarian barbarian = new Barbarian();
    barbarian.move();
    cleric.heal();
    cleric.heal("Poção de vida");
    cleric.heal("Feitiço", 7);
  }

  public static void moveAndAttack(PlayableCharacter player) {
    player.move();
    player.attack();
  }
}
