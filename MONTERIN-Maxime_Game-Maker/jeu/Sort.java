package jeu;

import enumeration.TYPE;

public class Sort {
	private String name;
	private int damage;
	private TYPE type;
	private int regen;
	
	public Sort(String name, int damage, TYPE type) {
		this.name = name;
		this.damage = damage;
		this.type = type;
	}
	
	public Sort(String name, TYPE type, int regen) {
		this.name = name;
		this.type = type;
		this.regen = regen;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public int getRegen() {
		return regen;
	}

	public void setRegen(int regen) {
		this.regen = regen;
	}

	@Override
	public String toString() {
		return "Sort [name=" + this.name + ", damage=" + this.damage + ", type=" + this.type + ", regen=" + this.regen + "]";
	}
	
}
