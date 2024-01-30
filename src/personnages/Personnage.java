package personnages;

public abstract class Personnage {
	private int force;
	private String nom;


public Personnage(String nom, Integer force) {
    this.nom = nom;
    this.force = force;
}

public String getNom() {
	return nom;
}
public void parler(String phrase) {
	System.out.println("le " + donnerAuteur()+" "+ nom+" "+phrase);
}
protected abstract String donnerAuteur();

public void frapper(Personnage personnage) {
	System.out.println(nom + ", envoie un grand coup dans la m�choire de "+ personnage.getNom());
	personnage.recevoirCoup(force/3);
}
public void recevoirCoup(int forceCoup) {
	this.force = this.force - forceCoup;
	if (this.force > 0 ) {
		this.parler(":<< Aie ! >>");
	}
	else if (this.force <= 0) {
		this.force =0;
		this.parler(":<< J'abandonne... >>");
	}
}

public static void main(String[] args) {
	Gaulois asterix = new Gaulois("Asterix",8);
	System.out.println(asterix.getNom());
}
}
