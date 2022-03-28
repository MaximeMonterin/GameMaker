package jeu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import enumeration.ARME;
import enumeration.CONSOMMABLE;
import enumeration.EMPLACEMENT;
import enumeration.MATERIEL;

public class main {

	public static void main(String[] args) {
		Arme arcDeLumière = new Arme(ARME.ARC, "Arc de Lumière", 300, 400);
		System.out.println(arcDeLumière.toString());
		
		Consommable potionVie = new Consommable(CONSOMMABLE.POTION_REGEN, "pv15", 3);
		System.out.println(potionVie.toString());
		
		Vetement pendentif = new Vetement(EMPLACEMENT.PENDENTIF, "pendentifConnu", MATERIEL.GOLD, 300);
		System.out.println(pendentif.toString());

	}

}
