public class Chemise extends Article {
    private String couture;

    // Constructeur
    public Chemise(int id, String lib, String couture) {
        super(id, lib);
        this.couture = couture;
    }
}