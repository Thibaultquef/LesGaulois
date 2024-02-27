package personnages;

public class Armure {
    private TypeArmure type;

    public Armure(TypeArmure type) {
        this.type = type;
    }

    public String getNom() {
        return type.getNom();
    }

    public int getReductionForce() {
        return type.getReductionForce();
    }
}
