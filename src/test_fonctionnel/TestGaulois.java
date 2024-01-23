package test_fonctionnel;
import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois(8,"Asterix");
		Romain minus = new Romain(6,"minus");
		System.out.println(asterix.getNom());
		asterix.parler(":<< Bonjour � tous >>");
		minus.parler(":<< UN GAU... UN GAUGAU... >>");
		minus.recevoirCoup(3);
		minus.recevoirCoup(3);
	}
}
