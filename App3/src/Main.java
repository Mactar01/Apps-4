public class Main {
    public static void main(String[] args) {
        ChemiseImpl chemise = new ChemiseImpl(0, "", "");
        chemise.saisie();
        chemise.affichage(chemise);

        MontreImpl montre = new MontreImpl(0, "", "");
        montre.saisie();
        montre.affichage(montre);
    }
}