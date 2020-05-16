package com.company;

public class Main {

    public static void main(String[] args) {
    	Boss b = new Boss();
    	b.setHealth(500);
    	b.setDamage(50);
    	b.setWeaponType("Steal arms");
    	b.setWeaponName("Gun");
		System.out.println("Boss information:" + " " + b.getHealth() + " " + b.getDamage() + " " + b.getWeaponType()
		+ " " + b.getWeaponName());
	}
}
