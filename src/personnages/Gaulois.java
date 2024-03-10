package personnages;

public class Gaulois extends Personnage {
	private double puissancePotion = 1;
	private int forceOrigine;

	public Gaulois(String nom, int force) {
		super(nom, force);
		forceOrigine = force;
	}

	@Override
	protected String donnerAuteur() {
		return "gaulois";
	}

	@Override
	public double calculForceFrappe(double forceCoup) {
		double newForceCoup = this.force * this.puissancePotion;
		this.puissancePotion = Math.max(1.0, this.puissancePotion - 0.5); 
		return newForceCoup;
	}

	public void recevoirPotion(double potion) {
		this.puissancePotion = potion;
	}

}
