package test_fonctionnel;
import personnages.Gaulois;
import personnages.Romain;
import sites.Camp;
import sites.Village;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		Gaulois vercingetorix = new Gaulois("Vercingétorix",5);
		Village gaule = new Village(vercingetorix);
		Romain minus = new Romain("Minus",2);
		Camp rome = new Camp(minus);
		System.out.println(asterix.getNom());
		asterix.parler(":<< Bonjour à tous >>");
		minus.parler(":<< UN GAU... UN GAUGAU... >>");
		minus.recevoirCoup(3);
		minus.recevoirCoup(3);
	}
}
