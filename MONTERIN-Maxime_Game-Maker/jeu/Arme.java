package jeu;

import enumeration.ARME;

public class Arme extends Objet{
	private ARME type;
	private String particularite;
	private int degats;
	private int durabilite;
	
	public Arme(ARME type, String name, int degats, int durabilite, String particularite) {
		super(name);
		this.type = type;
		this.degats = degats;
		this.durabilite = durabilite;
		this.particularite = particularite;
	}
	
	public Arme(ARME type, String name, int durabilite, String particularite) {
		super(name);
		this.type = type;
		this.durabilite = durabilite;
		this.particularite = particularite;
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
	
	public String getParticularite() {
		return particularite;
	}

	public void setParticularite(String particularite) {
		this.particularite = particularite;
	}

	@Override
	public String toString() {
		return "Arme [type=" + this.getType() + ", name=" + this.getName() + ", degats=" + this.getDegats() + ", durabilite=" + this.getDurabilite() + " frappes" + ", particularite = " + this.getParticularite() + "]";
	}
	
	
	
	
	
	
	
}
