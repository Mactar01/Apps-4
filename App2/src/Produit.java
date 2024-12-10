public class Produit {
    private String ref;
    private String libelle;
    private double quantite;
    private int prix;

    public Produit(String ref, String libelle, double quantite, int prix) {
        this.ref = ref;
        this.libelle = libelle;
        this.quantite = quantite;
        this.prix = prix;
    }
    public String getRef() {
        return ref;
    }

    public String getLibelle() {
        return libelle;
    }

    public double getQuantite() {
        return quantite;
    }

    public int getPrix() {
        return prix;
    }
}