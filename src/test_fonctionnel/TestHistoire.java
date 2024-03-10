package test_fonctionnel;
import java.util.Random;

import personnages.Gaulois;
import personnages.Grade;
import personnages.Soldat;
import sites.Camp;
import sites.Village;

public class TestHistoire {
    public static void main(String[] args) {

        Random random = new Random();


        Gaulois poissonier = new Gaulois("Poissonier", random.nextInt(15) + 1);
        Gaulois libraire = new Gaulois("Libraire", random.nextInt(15) + 1);
        Gaulois patissiere = new Gaulois("Patissiere", random.nextInt(15) + 1);
        Gaulois musicien = new Gaulois("Musicien", random.nextInt(15) + 1);
        Gaulois clown = new Gaulois("Clown", random.nextInt(15) + 1);


        Soldat professeur = new Soldat("Professeur", Grade.SOLDAT, random.nextInt(15) + 1);
        Soldat thibault = new Soldat("Thibault", Grade.SOLDAT, random.nextInt(15) + 1);
        Soldat vagabon = new Soldat("Vagabon", Grade.SOLDAT, random.nextInt(15) + 1);
        Soldat mage = new Soldat("Mage", Grade.SOLDAT, random.nextInt(15) + 1);
        Soldat guerrier = new Soldat("Guerrier", Grade.SOLDAT, random.nextInt(15) + 1);


        
        Village village = new Village(clown);
        Camp camp = new Camp(thibault);
        

        village.ajouterVillageois(poissonier);
        village.ajouterVillageois(libraire);
        village.ajouterVillageois(patissiere);
        village.ajouterVillageois(musicien);
        village.ajouterVillageois(clown);


        camp.ajouterSoldat(professeur);
        camp.ajouterSoldat(thibault);
        camp.ajouterSoldat(vagabon);
        camp.ajouterSoldat(mage);
        camp.ajouterSoldat(guerrier);
    }
}
