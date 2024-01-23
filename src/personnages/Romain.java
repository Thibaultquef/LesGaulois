package personnages;

public class Romain {
	private int force;
	private String nom;
	
	public Romain(int force,String nom) {
		this.nom = nom;
		this.force = force;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String phrase) {
		System.out.println("le Romain " + nom+" "+phrase);
	}
	public void recevoirCoup(int forceCoup) {
		this.force = this.force - forceCoup;
		if (this.force > 0 ) {
			this.parler(":<< A�e ! >>");
		}
		else if (this.force <= 0) {
			this.force =0;
			this.parler(":<< J'abandonne... >>");
		}
	}
}
