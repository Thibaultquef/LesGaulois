package personnages;

public class Gaulois {
	private int force;
	private String nom;
	
	public Gaulois(int force,String nom) {
		this.force = force;
		this.nom = nom;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void parler(String phrase) {
		System.out.println("le Gaulois " + nom+" "+phrase);
	}
	public void frapper(Romain romain) {
		System.out.println(nom + ", envoie un grand coup dans la m�choire de "+ romain.getNom());
		romain.recevoirCoup(force/3);
	}
	
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois(8,"Asterix");
		System.out.println(asterix.getNom());
	}
}
