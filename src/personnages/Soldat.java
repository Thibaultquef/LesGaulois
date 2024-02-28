package personnages;
import armure.Casque;
import armure.Bouclier;
import armure.Plastron;

public class Soldat extends Romain {
	public Grade grade;
	Casque casque = null;
	Bouclier bouclier = null;
	Plastron  plastron = null;
	
	public Soldat(String nom,  Grade grade, int force) {
		super(nom, force);
		this.grade = grade;
	}
	
	@Override
	protected String donnerAuteur() {
		return grade.getNom();
	}
	
	@Override
	public void recevoirCoup(int forceCoup) {
		int newForceCoup = forceCoup;
	    if (casque != null && bouclier != null && plastron != null) {
	    	int protection = (casque.getProtection() + bouclier.getProtection() + plastron.getProtection());
	    	newForceCoup = forceCoup - protection;}
	    
	    if (newForceCoup > 0) {
	        force = force - newForceCoup;
	        if (force > 0) {
	            parler("Aïe");
	        } else {
	            force = 0;
	            parler("J'abandonne");
	        }
	    } 
	}
	
	public void equiperArmure() {
		if (casque == null) {
			casque = new Casque();
			System.out.println("Le soldat "+nom+"à déja un casque.");
			}
		else
			parler("J'ai déja un casque");
		
		if (plastron == null) {
			plastron = new Plastron();
			System.out.println("Le soldat "+nom+"à déja un plastron.");
		}
		else
			parler("J'ai déja un plastron");
		if (bouclier == null) {
			bouclier = new Bouclier();
			System.out.println("Le soldat "+nom+"à déja un bouclier.");
		}
		else 
			parler("J'ai déja un bouclier");
		
	}
}
