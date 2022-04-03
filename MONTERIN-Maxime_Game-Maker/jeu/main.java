package jeu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import enumeration.ARME;
import enumeration.DIVISION_GUILDE;
import enumeration.EMPLACEMENT;
import enumeration.MATERIEL;
import enumeration.SPECIALITES;
import enumeration.TYPE;

public class main {

	public static void main(String[] args) {
		//GUILDE
		Guilde communauteAnneau = new Guilde("Communaute de l'Anneau", DIVISION_GUILDE.MASTER);
		
		
		//ARAGORN
		
		
		//INVENTAIRE ARAGORN
		Consommable painElfique = new Consommable("Pain elfique", 10);
		List<Objet> autreAragornStockage = new ArrayList<>();
		autreAragornStockage.add(painElfique);
		Conteneur autreAragorn = new Conteneur("autreAragorn", 50, autreAragornStockage);
		
		List<Objet> baluchonAragornStockage = new ArrayList<>();
		Conteneur baluchonAragorn = new Conteneur("baluchon", 10, baluchonAragornStockage);
		
		List<Conteneur> inventaireAragorn = new ArrayList<>();
		inventaireAragorn.add(autreAragorn);
		inventaireAragorn.add(baluchonAragorn);
		
		//ARME ARAGORN
		Arme Anduril = new Arme(ARME.EPEE_LONGUE, "Anduril", 120000, 120000, "Peut comabttre les spectres");
		List<Arme> armesAragorn = new ArrayList<>();
		armesAragorn.add(Anduril);
		
		//ARMURE ARAGORN
		Vetement couronneDuGondor = new Vetement("Couronne du Gondor", EMPLACEMENT.CASQUE, MATERIEL.AUTRE, 120000);
		Vetement plastronPlaqueGondor = new Vetement("Plastron en plaque du Gondor", EMPLACEMENT.PLASTRON, MATERIEL.AUTRE, 120000);
		Vetement jambierePlaqueGondor = new Vetement("Jambières en plaque du Gondor", EMPLACEMENT.JAMBES, MATERIEL.AUTRE, 120000);
		Vetement bottesRodeur = new Vetement("Bottes du rodeur", EMPLACEMENT.CHAUSSURES, MATERIEL.AUTRE, 120000);
		Vetement etoileSoirArwen = new Vetement("Etoile du soir d'Arwen", EMPLACEMENT.PENDENTIF, MATERIEL.AUTRE, 120000);
		
		HashMap<EMPLACEMENT, Vetement> armureAragornHashmap = new HashMap<>();
		armureAragornHashmap.put(EMPLACEMENT.CASQUE, couronneDuGondor);
		armureAragornHashmap.put(EMPLACEMENT.PLASTRON, plastronPlaqueGondor);
		armureAragornHashmap.put(EMPLACEMENT.JAMBES, jambierePlaqueGondor);
		armureAragornHashmap.put(EMPLACEMENT.CHAUSSURES, bottesRodeur);
		armureAragornHashmap.put(EMPLACEMENT.PENDENTIF, etoileSoirArwen);
		
		Armure armureAragorn = new Armure(armureAragornHashmap);
		
		//SPECIALITE ARAGORN
		Sort rush = new Sort("Rush", 120000, TYPE.CORPS_A_CORPS);
		Sort estocade = new Sort("Estocade", 120000, TYPE.CORPS_A_CORPS);
		List<Sort> moovepoolAragorn = new ArrayList<>();
		moovepoolAragorn.add(rush);
		moovepoolAragorn.add(estocade);
		
		Specialte speAragorn = new Specialte(SPECIALITES.GUERRIER, moovepoolAragorn);
		
		//MONTURE ARAGORN
		Monture hasufel = new Monture("Hasufel", "Cheval");
		
		Personnage Aragorn = new Personnage("Aragorn", 120, inventaireAragorn, armesAragorn, armureAragorn, communauteAnneau, speAragorn, hasufel);
		
		System.out.println(Aragorn.toString());
		
		
		//GANDALF
		
		
		//INVENTAIRE GANDALF
		painElfique.setQte(2);
		Consommable palentir = new Consommable("Palentir", 1);
		List<Objet> autreGandalfStockage = new ArrayList<>();
		autreGandalfStockage.add(painElfique);
		autreGandalfStockage.add(palentir);
		Conteneur autreGandalf = new Conteneur("autreGandalf", 50, autreGandalfStockage);
		
		List<Objet> baluchonGandalfStockage = new ArrayList<>();
		Conteneur baluchonGandalf = new Conteneur("baluchon", 10, baluchonGandalfStockage);
		
		List<Conteneur> inventaireGandalf = new ArrayList<>();
		inventaireGandalf.add(autreGandalf);
		inventaireGandalf.add(baluchonGandalf);
		
		//ARME GANDALF
		Arme batonBlancVieillard = new Arme(ARME.BATON, "Baton blanc du vieillard", 1200000, 1200000, "Peut rompre le control mental");
		List<Arme> armesGandalf = new ArrayList<>();
		armesGandalf.add(batonBlancVieillard);
		
		//ARMURE GANDALF
		Vetement chapeauMagicien = new Vetement("Chapeau du magicien", EMPLACEMENT.CASQUE, MATERIEL.AUTRE, 1200000);
		Vetement tuniqueMagicien = new Vetement("Tunique blanche du magicien", EMPLACEMENT.PLASTRON, MATERIEL.AUTRE, 1200000);
		Vetement pantalonBlanc = new Vetement("Pantalon Blanc", EMPLACEMENT.JAMBES, MATERIEL.AUTRE, 1200000);
		Vetement bottesMagicien = new Vetement("Bottes du magicien", EMPLACEMENT.CHAUSSURES, MATERIEL.AUTRE, 1200000);
		
		HashMap<EMPLACEMENT, Vetement> armureGandalfHashmap = new HashMap<>();
		armureGandalfHashmap.put(EMPLACEMENT.CASQUE, chapeauMagicien);
		armureGandalfHashmap.put(EMPLACEMENT.PLASTRON, tuniqueMagicien);
		armureGandalfHashmap.put(EMPLACEMENT.JAMBES, pantalonBlanc);
		armureGandalfHashmap.put(EMPLACEMENT.CHAUSSURES, bottesMagicien);
		
		Armure armureGandalf = new Armure(armureGandalfHashmap);
		
		//SPECIALITE GANDALF
		Sort eblouissement = new Sort("eblouissement", 120000, TYPE.DISTANCE);
		Sort eclair = new Sort("eclair", 12000000, TYPE.DISTANCE);
		List<Sort> moovepoolGandalf = new ArrayList<>();
		moovepoolGandalf.add(eblouissement);
		moovepoolGandalf.add(eclair);
		
		Specialte speGandalf = new Specialte(SPECIALITES.MAGE, moovepoolGandalf);
		
		//MONTURE GANDALF
		Monture grisPoil = new Monture("GrisPoil", "Cheval");
		
		Personnage Gandalf = new Personnage("Gandalf", 5600, inventaireGandalf, armesGandalf, armureGandalf, communauteAnneau, speGandalf, grisPoil);
		
		System.out.println(Gandalf.toString());
		
	}

}
