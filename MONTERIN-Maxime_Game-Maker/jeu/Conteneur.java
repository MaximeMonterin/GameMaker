package jeu;

import java.util.List;

public class Conteneur {
	private String name;
	private int taille;
	private List<Objet> conteneur;

	public Conteneur(String name, int taille, List<Objet> conteneur) {
		this.name = name;
		this.taille = taille;
		this.conteneur = conteneur;
	}

	public List<Objet> getConteneur() {
		return conteneur;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}

	public void addToConteneur(List<Objet> conteneur, Objet objet) {
		conteneur.add(objet);
	}

	@Override
	public String toString() {
		return "Conteneur [name=" + this.getName() + ", taille=" + this.getTaille() + ", contient=" + this.getConteneur().toString() + "]";
	}

}
