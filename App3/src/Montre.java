public class Montre extends Article {
    private String nature;

    // Constructeur
    public Montre(int id, String lib, String nature) {
        super(id, lib);
        this.nature = nature;
    }
}