import java.util.Scanner;

public class ProduitImpl extends Produit implements IProduit {
    private Scanner scanner;

    public ProduitImpl() {
        super("", "", 0, 0);
        scanner = new Scanner(System.in);
    }
    public void saisie() {
        System.out.print("Entrez la reference: ");
        this.ref = scanner.nextLine();
        System.out.print("Entrez le libelle: ");
        this.libelle = scanner.nextLine();
        System.out.print("Entrez la quantite: ");
        this.quantite = scanner.nextDouble();
        System.out.print("Entrez le prix: ");
        this.prix = scanner.nextInt();
    }

    public void affichage(Produit p) {
        System.out.println("Reference: " + p.getRef());
        System.out.println("Libelle: " + p.getLibelle());
        System.out.println("Quantite: " + p.getQuantite());
        System.out.println("Prix: " + p.getPrix());
    }
}