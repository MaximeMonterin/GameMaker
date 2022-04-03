package jeu;

import enumeration.EMPLACEMENT;
import enumeration.MATERIEL;

public class Vetement extends Objet{
	private EMPLACEMENT emplacement;
	private MATERIEL materiel;
	private int durabilite;
	
	public Vetement(String name, EMPLACEMENT emplacement, MATERIEL materiel, int durabilite) {
		super(name);
		this.emplacement = emplacement;
		this.materiel = materiel;
		this.durabilite = durabilite;
	}

	public EMPLACEMENT getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(EMPLACEMENT emplacement) {
		this.emplacement = emplacement;
	}

	public MATERIEL getMateriel() {
		return materiel;
	}

	public void setMateriel(MATERIEL materiel) {
		this.materiel = materiel;
	}

	public int getDurabilite() {
		return durabilite;
	}

	public void setDurabilite(int durabilite) {
		this.durabilite = durabilite;
	}

	@Override
	public String toString() {
		return "Vetement [emplacement=" + this.getEmplacement() + ", name=" + this.getName() + ", materiel=" + this.getMateriel() + ", durabilite=" + this.getDurabilite() + "]";
	}
	
	
	
	

}
