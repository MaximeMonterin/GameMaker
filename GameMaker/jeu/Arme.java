package jeu;

import enumeration.ARME;

public class Arme extends Objet{
	private ARME type;
	private int degats;
	private int durabilite;
	
	public Arme(ARME type, String name, int degats, int durabilite) {
		super(name);
		this.type = type;
		this.degats = degats;
		this.durabilite = durabilite;
	}

	public ARME getType() {
		return type;
	}

	public void setType(ARME type) {
		this.type = type;
	}

	public int getDegats() {
		return degats;
	}

	public void setDegats(int degats) {
		this.degats = degats;
	}

	public int getDurabilite() {
		return durabilite;
	}

	public void setDurabilite(int durabilite) {
		this.durabilite = durabilite;
	}

	@Override
	public String toString() {
		return "Arme [type=" + this.getType() + ", name=" + this.getName() + ", degats=" + this.getDegats() + ", durabilite=" + this.getDurabilite() + " frappes]";
	}
	
	
	
	
	
	
	
}
