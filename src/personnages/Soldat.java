package personnages;

public class Soldat extends Romain {
    public Soldat(String nom, int force) {
        super(nom, force);
    }
    @Override
	protected String donnerAuteur() {
		return "soldat";
	}
}
