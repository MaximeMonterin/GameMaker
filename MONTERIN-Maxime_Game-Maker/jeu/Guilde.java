package jeu;

import java.util.List;
import java.util.Objects;

import enumeration.DIVISION_GUILDE;

public class Guilde {
	private String name;
	private DIVISION_GUILDE rang;
	private List<Personnage> membres;
	private Personnage chef;
	
	public Guilde(String name, DIVISION_GUILDE rang) {
		this.name = name;
		this.rang = rang;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public DIVISION_GUILDE getRang() {
		return rang;
	}

	public void setRang(DIVISION_GUILDE rang) {
		this.rang = rang;
	}

	public List<Personnage> getMembres() {
		return membres;
	}

	public void addMembres(List<Personnage> membres, Personnage personnage) {
		this.membres.add(personnage);
	}

	public Personnage getChef() {
		return chef;
	}

	public void setChef(Personnage chef) {
		this.chef = chef;
	}

	@Override
	public String toString() {
		if(this.chef == null && this.membres == null) {
			return "Guilde [name=" + this.name + ", rang=" + this.rang + "]";
		}
		return "Guilde [name=" + this.name + ", rang=" + this.rang + ", membres=" + this.membres.toString() + ", chef=" + this.chef.toString() + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guilde other = (Guilde) obj;
		return Objects.equals(chef, other.chef) && Objects.equals(membres, other.membres)
				&& Objects.equals(name, other.name) && rang == other.rang;
	}
	
}
