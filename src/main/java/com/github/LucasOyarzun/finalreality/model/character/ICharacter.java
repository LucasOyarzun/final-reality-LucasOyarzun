package com.github.LucasOyarzun.finalreality.model.character;

import com.github.LucasOyarzun.finalreality.model.character.player.CharacterClass;
import com.github.LucasOyarzun.finalreality.model.weapon.AbstractWeapon;

/**
 * This represents a character from the game.
 * A character can be controlled by the player or by the CPU (an enemy).
 *
 * @author Ignacio Slater Muñoz.
 * @author Lucas Oyarzun Mendez.
 */
public interface ICharacter {

  /**
   * Sets a scheduled executor to make this character (thread) wait for {@code speed / 10}
   * seconds before adding the character to the queue.
   */
  void waitTurn();

  /**
   * Returns this character's name.
   */
  String getName();

  /**
   * Equips a weapon to the character.
   */

  /**
   * Return this character's equipped weapon.
   */
  AbstractWeapon getEquippedWeapon();

  int getMaxLife();

  int getLife();

  int getDefense();

  Status getStatus();

  void attack(AbstractCharacter objective, int amount);

  void loseLife(int amount);

  void beHealed(int amount);

  void beAffected(Status status, int magicDamage);

  void die();
  /**
   * Returns this character's class.
   */
  CharacterClass getCharacterClass();

  void equip(AbstractWeapon weapon);

  void addEquip(AbstractWeapon weapon);

}
