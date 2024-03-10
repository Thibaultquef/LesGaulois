package personnages;
import personnages.Armures;

public class Soldat extends Romain {
	public Grade grade;
	private Armures casque = null;
	private Armures bouclier = null;
	private Armures  plastron = null;
	
	public Soldat(String nom,  Grade grade, int force) {
		super(nom, force);
		this.grade = grade;
	}
	
	@Override
	protected String donnerAuteur() {
		return grade.getNom();
	}
	
	@Override
	public double armure(double forceCoup) {
		double newForceCoup = forceCoup;
	    if (casque != null && bouclier != null && plastron != null) {
	    	int armure = (casque.getProtection() + bouclier.getProtection() + plastron.getProtection());
	    	System.out.println("Le casque attenue les dégats de " + casque.getProtection());
	    	System.out.println("Le bouclier attenue les dégats de " + bouclier.getProtection());
	    	System.out.println("Le plastron attenue les dégats de " + plastron.getProtection());
	    	newForceCoup = forceCoup - armure;}
	    
	    return newForceCoup;
	}
	
	public void equiperArmure() {
		if (casque == null) {
			casque = Armures.CASQUE;
			System.out.println("Le soldat "+nom+"à déja un casque.");
			}
		else
			parler("J'ai déja un casque");
		
		if (plastron == null) {
			plastron = Armures.PLASTRON;
			System.out.println("Le soldat "+nom+"à déja un plastron.");
		}
		else
			parler("J'ai déja un plastron");
		if (bouclier == null) {
			bouclier = Armures.BOUCLIER;
			System.out.println("Le soldat "+nom+"à déja un bouclier.");
		}
		else 
			parler("J'ai déja un bouclier");
		
	}
}
