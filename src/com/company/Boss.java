package com.company;

public class Boss extends GameEntity {
    private String weaponType;
    private String weaponName;

    public void setWeaponType(String weaponType) {
        this.weaponType = weaponType;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    String getWeaponType() {
        return weaponType;
    }

    String getWeaponName() {
        return weaponName;
    }
}
