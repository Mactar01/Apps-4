import java.util.Scanner;

public class MontreImpl extends Montre implements IMontre {
    private Scanner scanner;

    public MontreImpl(int id, String lib, String nature) {
        super(id, lib, nature);
        scanner = new Scanner(System.in);
    }
    public void saisie() {
        System.out.print("Entrez l'ID: ");
        this.id = scanner.nextInt();
        scanner.nextLine(); // Pour consommer le retour à la ligne
        System.out.print("Entrez le libellé: ");
        this.lib = scanner.nextLine();
        System.out.print("Entrez la nature: ");
        this.nature = scanner.nextLine();
    }
    public void affichage(Montre m) {
        System.out.println("ID: " + m.id + ", Libellé: " + m.lib + ", Nature: " + this.nature);
    }
}