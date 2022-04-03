package jeu;

public class Consommable extends Objet{
	private int qte;

	public Consommable(String name, int qte) {
		super(name);
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
