package jeu;

import java.util.Map.Entry;
import java.util.Map;

import enumeration.EMPLACEMENT;

public class Armure {
	private Map<EMPLACEMENT, Vetement> armure;

	public Armure(Map<EMPLACEMENT, Vetement> armure) {
		int cpt = 0;
        for (Entry<EMPLACEMENT, Vetement> m : armure.entrySet()) {
        	if(m.getKey().name() == m.getValue().getEmplacement().name()) {
        		++cpt;
        	}
        	else {
        		break;
        	}
        }
        if(cpt == armure.size()) {
        	this.armure = armure;
        	System.out.println("validation du port de l'armure");
        }
        else {
        	System.out.println("problème de position d'un item de l'armure");
        	this.armure = null;
        }
	}

	public Map<EMPLACEMENT, Vetement> getArmure() {
		return armure;
	}

	public void setArmure(Map<EMPLACEMENT, Vetement> armure) {
		this.armure = armure;
	}

	@Override
	public String toString() {
		if(this.armure == null) {
			return "Armure = null";
		}
		return "Armure [armure=" + this.getArmure().toString() + "]";
	}
	
	

}
