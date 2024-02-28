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
	public int calculForceFrappe() {
		int forceFrappe = super.calculForceFrappe();
		if (puissancePotion > 1) {
			forceFrappe = forceOrigine * (int) puissancePotion;
			puissancePotion = puissancePotion - 0.5;
		}
		return forceFrappe;
	}

	public void recevoirPotion(double potion) {
		this.puissancePotion = potion;
	}

}
