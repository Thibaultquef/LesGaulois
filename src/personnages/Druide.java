package personnages;

import java.util.Random;

public class Druide extends Gaulois {

	private int dosesPotion;
	private int forcePotion;
	private Random random = new Random();

	public Druide(String nom, int force) {
		super(nom, force);
	}

	public void fabriquerPotion(int doses) {
		dosesPotion = doses;
		forcePotion = 2 + (int) (random.nextInt(4));
		this.parler("J'ai concocté " + dosesPotion + " doses de potion magique. Elle a une force de " + forcePotion);
	}

	public void donnerPotion(Gaulois gaulois) {
		if (!"Obélix".equals(gaulois.getNom())) {
			if (dosesPotion > 0) {
				this.parler("Tiens " + gaulois.getNom() + " un peu de potion magique.");
				gaulois.recevoirPotion(forcePotion);
				dosesPotion--;
			} else {
				this.parler("Désolé " + gaulois.getNom() + "il n'y a plus une seule goutte de potion.");
			}
		} else {
			this.parler("Non, Obélix Non !... Et tu le sais très bien !");
		}
	}

}
