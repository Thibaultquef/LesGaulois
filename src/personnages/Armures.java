package personnages;

public enum Armures {
	BOUCLIER("Bouclier", 3), CASQUE("Casque", 2), PLASTRON("Plastron", 3);
	
	
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
