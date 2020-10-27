package com.github.LucasOyarzun.finalreality.model.character;

import com.github.LucasOyarzun.finalreality.model.character.player.CharacterClass;
import com.github.LucasOyarzun.finalreality.model.weapon.AbstractWeapon;

/**
 * This represents a character from the game.
 * A character can be controlled by the player or by the CPU (an enemy).
 *
 * @author Ignacio Slater Muñoz.
 * @author Lucas Oyarzun Mendez
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
   * Returns this character's class.
   */
  CharacterClass getCharacterClass();

  /**
   * Return this character's defense.
   */
  int getDefense();

  /**
   * Return this character's Life Points.
   */
  int getLifePoints();

  /**
   * Decrease this character's life Points by a int value.
   */
  void loseLife(int cantidad);

  /**
   * Return true is this character's Life Points are over 0, else, return false
   */
  boolean isAlive();
}
