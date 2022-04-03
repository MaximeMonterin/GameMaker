package jeu;

import java.util.List;


public class Personnage {
	private String pseudo;
	private int level;
	private List<Conteneur> inventaire;
	private List<Arme> armes;
	private Armure armure;
	private Guilde guilde;
	private Specialte specialite;
	private Monture monture;
	
	public Personnage(String pseudo, int level, List<Conteneur> inventaire, List<Arme> armes,
			Armure armure, Guilde guilde, Specialte specialite, Monture monture) {
		this.pseudo = pseudo;
		this.level = level;
		this.inventaire = inventaire;
		this.armes = armes;
		this.armure = armure;
		this.guilde = guilde;
		this.specialite = specialite;
		this.monture = monture;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public List<Conteneur> getInventaire() {
		return inventaire;
	}

	public void setInventaire(List<Conteneur> inventaire) {
		this.inventaire = inventaire;
	}

	public List<Arme> getArmes() {
		return armes;
	}

	public void setArmes(List<Arme> armes) {
		this.armes = armes;
	}

	public Armure getArmure() {
		return armure;
	}

	public void setArmure(Armure armure) {
		this.armure = armure;
	}
	
	public Guilde getGuilde() {
		return guilde;
	}

	public void setGuilde(Guilde guilde) {
		this.guilde = guilde;
	}
	
	public Specialte getSpecialite() {
		return specialite;
	}

	public void setSpecialite(Specialte specialite) {
		this.specialite = specialite;
	}

	public Monture getMonture() {
		return monture;
	}

	public void setMonture(Monture monture) {
		this.monture = monture;
	}

	@Override
	public String toString() {
		return "Personnage [pseudo=" + this.getPseudo() + ", level=" + this.getLevel() + ", inventaire=" + this.getInventaire().toString() + ", armes=" + this.getArmes()
				+ ", armure=" + this.getArmure().toString() + ", guilde=" + this.getGuilde().toString() + ", specialite=" + this.getSpecialite().toString() + ", monture=" + this.getMonture().toString() +"]";
	}
	
	

}
