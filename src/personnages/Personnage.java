package personnages;

abstract class Personnage {
	protected String nom;
	protected int force;

	protected Personnage(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	protected double armure(double forceCoup){
		return forceCoup;
	}
	
	public void parler(String texte) {
		System.out.println("Le " + donnerAuteur() + " " + nom + " : \"" + texte + "\"");
	}

	protected abstract String donnerAuteur();

	public void frapper(Personnage adversaire) {
		
		if(!adversaire.estMort() && !this.estMort()) {
			this.parler("envoie un grand coup dans la mâchoire de " + adversaire.getNom() + " avec une force de " + calculForceFrappe(force));
			adversaire.recevoirCoup(calculForceFrappe(force));
		}
		else {
			this.parler("Je ne peux plus me battre...");
		}
	}


	protected double calculForceFrappe(double force) {
		return force;
	}

	

	public void recevoirCoup(double forceCoup) {
		
		forceCoup = armure(forceCoup);
		this.force -=  forceCoup;
		
		if (this.force <= 0) {
			this.force = 0;
			this.parler("J'abandonne...");
		} else {
			this.parler("Aïe !");
		}
	}

	public boolean estMort() {
		boolean estMort = false;
		if (this.force <= 0) {
			estMort= true;
		} 
		return estMort;
	}

}





