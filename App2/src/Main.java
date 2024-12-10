public class Main {
    public static void main(String[] args) {
        ProduitImpl produit = new ProduitImpl();
        produit.saisie();
        produit.affichage(produit);
    }
}