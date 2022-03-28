package jeu;

import enumeration.CONSOMMABLE;

public class Consommable extends Objet{
	private int qte;
	private CONSOMMABLE type;

	public Consommable(CONSOMMABLE type, String name, int qte) {
		super(name);
		this.type = type;
		this.qte = qte;
	}

	public int getQte() {
		return qte;
	}

	public void setQte(int qte) {
		this.qte = qte;
	}

	@Override
	public String toString() {
		return "Consommable [name=" + this.getName() + ", quantité=" + this.getQte() + "]";
	}
	
	
	
	

}
