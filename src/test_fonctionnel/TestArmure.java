package test_fonctionnel;

import java.util.Random;

import personnages.Druide;
import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestArmure {
    public static void main(String[] args) {

        Random random = new Random();


        Gaulois poissonier = new Gaulois("Poissonier", random.nextInt(6) + 1);
        Gaulois libraire = new Gaulois("Libraire", random.nextInt(6) + 1);
        Gaulois patissier = new Gaulois("Patissier", random.nextInt(6) + 1);
        Gaulois musicien = new Gaulois("Musicien", random.nextInt(6) + 1);
        Gaulois clown = new Gaulois("Clown", random.nextInt(6) + 1);


        Soldat professeur = new Soldat("Professeur", Grade.SOLDAT, random.nextInt(6) + 1);
        Soldat thibault = new Soldat("Thibault", Grade.SOLDAT, random.nextInt(6) + 1);
        Soldat vagabon = new Soldat("Vagabon", Grade.SOLDAT, random.nextInt(6) + 1);
        Soldat mage = new Soldat("Mage", Grade.SOLDAT, random.nextInt(6) + 1);
        Soldat guerrier = new Soldat("Guerrier", Grade.SOLDAT, random.nextInt(6) + 1);
        Druide panoramix = new Druide("Panoramix",1);


        
        Village village = new Village(clown);
        Camp camp = new Camp(thibault);
        
		panoramix.fabriquerPotion(3);
		
		
		panoramix.donnerPotion(poissonier);
		panoramix.donnerPotion(libraire);
		panoramix.donnerPotion(patissier);
		panoramix.donnerPotion(musicien);
		panoramix.donnerPotion(clown);

        village.ajouterVillageois(poissonier);
        village.ajouterVillageois(libraire);
        village.ajouterVillageois(patissier);
        village.ajouterVillageois(musicien);
        village.ajouterVillageois(clown);


        camp.ajouterSoldat(professeur);
        camp.ajouterSoldat(thibault);
        camp.ajouterSoldat(vagabon);
        camp.ajouterSoldat(mage);
        camp.ajouterSoldat(guerrier);
		
		for(int i =0 ; i < camp.getNbSoldats();i++) {
			camp.getArmee()[i].equiperArmure();
		}
	
		while(!thibault.estMort() && !poissonier.estMort()) {
			poissonier.frapper(thibault);
			thibault.frapper(poissonier);
			}
		}
	
}
