public abstract class Personne implements IPersonne {
    protected String nom;
    protected String prenom;

    public Personne() {
    }

    public Personne(String nom, String prenom) {
//        this.nom = nom;
//        this.prenom = prenom;
    }

    // Getters et Setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
//        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
//        this.prenom = prenom;
    }

    public void saisie() {
        // Implémentation exemple
        System.out.println("Saisir nom : ");
        nom = new java.util.Scanner(System.in).nextLine();
        System.out.println("Saisir prénom : ");
        prenom = new java.util.Scanner(System.in).nextLine();
    }
}
