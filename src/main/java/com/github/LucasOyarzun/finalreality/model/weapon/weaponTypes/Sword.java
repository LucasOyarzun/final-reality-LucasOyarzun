package com.github.LucasOyarzun.finalreality.model.weapon.weaponTypes;

import com.github.LucasOyarzun.finalreality.model.weapon.AbstractWeapon;
import com.github.LucasOyarzun.finalreality.model.weapon.WeaponType;

public class Sword extends AbstractWeapon {
    /**
     * Creates a weapon with a name, a base damage and weight.
     *
     * @param name
     * @param damage
     * @param weight
     * @see WeaponType
     */
    public Sword(String name, int damage, int weight) {
        super(name, damage, weight, WeaponType.SWORD);
    }
}
