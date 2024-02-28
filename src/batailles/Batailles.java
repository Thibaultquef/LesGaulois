package batailles;
import personnages.Gaulois;
import personnages.Soldat;
import personnages.Grade;
import sites.Camp;
import sites.Village;
import java.util.Random;

public class Batailles {
    public void main(String[] args) {
        Village village = new Village("Village des Gaulois");
        Camp camp = new Camp("Camp Romain");

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


        camp.ajouterSoldat(poissonier);
        camp.ajouterSoldat(libraire);
        camp.ajouterSoldat(patissiere);
        camp.ajouterSoldat(musicien);
        camp.ajouterSoldat(clown);


        village.ajouterVillageois(professeur);
        village.ajouterVillageois(thibault);
        village.ajouterVillageois(vagabon);
        village.ajouterVillageois(mage);
        village.ajouterVillageois(guerrier);
    }
    
}
