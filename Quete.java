import java.util.ArrayList;

public class Quete {
    private String nom;
    private ArrayList<QueteTache> taches;

    public Quete(String nom){
        this.nom = nom;
        this.taches = new ArrayList<>();
    }

    public String getNom() { return nom;}

    public void ajouterTache(QueteTache t){
        taches.add(new QueteTache(t));
    }

    public int nombreDeTaches(){ return taches.size();}

    public void afficherTaches() {
        for (QueteTache t : taches) {
            System.out.println("- " + t.getDescription() + " (difficulté " + t.getDifficulte() + ")");
        }
    }
}
