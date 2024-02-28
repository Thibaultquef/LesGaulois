package personnages;

public enum Armures {
	Bouclier(3), Casque(2), Plastron(3);

	private final int protection;

	Armures(int protection) {
		this.protection = protection;
	}

	public int getProtection() {
		return protection;
	}
}
