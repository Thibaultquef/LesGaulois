package sites;

import personnages.Gaulois;

public class Village {
	private Gaulois chef;
	private Gaulois[] villageois = new Gaulois[4];
	private int nbVillageois = 0;
	
	public Village(Gaulois chef) {
		this.chef = chef;
		chef.parler("Je suis un grand guerrier et je vais créer mon village ");
	}
	
	public Gaulois getChef() {
		return chef;
	}
	
	public boolean ajouterVillageois(Gaulois gaulois) {
		for (int i=0; i< villageois.length; i++) {
			if (villageois[i] == null) {
				chef.parler("Bienvenue " + gaulois.getNom() + " !");
				villageois[i] = gaulois;
				nbVillageois +=1;
				return true;
			}
		}
		chef.parler("Désolé " + gaulois.getNom() + "  mon village est déjà bien rempli.");
		return false;
	}
	
	public void afficherVillageois() {
		String affichageVillage = "Le village dirigé par " + chef.getNom() + " est habité par : \n";
		for (int i=0; i<villageois.length;i++) {
			if(villageois[i]!=null) {
				affichageVillage += "- " + villageois[i].getNom() + "\n"; 
			}
		}
		System.out.println(affichageVillage);
	}
	
	public void changerChef(Gaulois gaulois) {
			chef.parler("Je laisse mon grand bouclier au grand " + gaulois.getNom() );
			chef = gaulois;
			chef.parler("Merci !");
	}
	
	public int getNbVillageois() {
		return nbVillageois;
	}
	
	public Gaulois[] getVillageois() {
		return villageois;
	}

}
