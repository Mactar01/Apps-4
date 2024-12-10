public class Etudiant extends Personne {
    private String matricule;
    private double moyenne;

    public Etudiant() {
    }

    public Etudiant(double moyenne) {
        this.moyenne = moyenne;
    }

    // Getters et Setters
    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void setMoyenne(double moyenne) {
        this.moyenne = moyenne;
    }

    public String generateMatricule() {
        this.matricule = "ET-" + System.currentTimeMillis();
        return matricule;
    }

    public void saisie() {
        super.saisie();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.println("Saisir moyenne : ");
        this.moyenne = scanner.nextDouble();
        generateMatricule();
    }
    public void affiche() {
        System.out.println("Étudiant : " + nom + " " + prenom + ", Matricule : " + matricule + ", Moyenne : " + moyenne);
    }
}
