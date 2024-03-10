package personnages;

public enum Armures {
	Bouclier("Bouclier", 3), Casque("Casque", 2), Plastron("Plastron", 3);
	
	
	private final String nom;
	private final int protection;

	Armures(String nom, int protection) {
		this.nom = nom;
		this.protection = protection;
	}
	
	public String getnom(){
		return nom;
	}

	public int getProtection() {
		return protection;
	}
}
