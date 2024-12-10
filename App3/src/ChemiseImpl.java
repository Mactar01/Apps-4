import java.util.Scanner;

public class ChemiseImpl extends Chemise implements IArticle {
    private Scanner scanner;

    public ChemiseImpl(int id, String lib, String couture) {
        super(id, lib, couture);
        scanner = new Scanner(System.in);
    }
    public void saisie() {
        System.out.print("Entrez l'ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne
        System.out.print("Entrez le libellé: ");
        this.lib = scanner.nextLine();
        System.out.print("Entrez la couture: ");
        this.couture = scanner.nextLine();
    }

    public void affichage(Article a) {
        System.out.println("ID: " + a.id + ", Libellé: " + a.lib + ", Couture: " + this.couture);
    }
}