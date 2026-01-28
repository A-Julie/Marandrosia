import java.util.ArrayList;
import java.util.Iterator;

public abstract class Royaume {

    private String nom;
    private int population;
    protected ArrayList<Archipel> archipels; // protected pour héritage

    // Constructeur par défaut (implicite)
    public Royaume() {
        this.nom = "Royaume Sans Nom";
        this.population = 0;
        this.archipels = new ArrayList<>();
    }

    // Constructeur explicite
    public Royaume(String nom, int population) {
        this.nom = nom;
        this.population = population;
        this.archipels = new ArrayList<>();
    }

    public String getNom() { return nom; }
    public int getPopulation() { return population; }

    public void ajouterArchipel(Archipel a) {
        archipels.add(a);
    }

    // Méthode abstraite → doit être redéfinie dans les sous-classes
    public abstract String decrire();

    // Méthode normale
    public String sanctifier() {
        return "Le royaume " + nom + " bénit ses terres.";
    }

    // Exemple d'utilisation d'un itérateur
    public void afficherArchipels() {
        Iterator<Archipel> it = archipels.iterator();
        while (it.hasNext()) {
            System.out.println("- " + it.next().getNom());
        }
    }

    // Classe interne
    public class GardeRoyal {
        public void saluer() {
            System.out.println("Le garde royal protège " + nom);
        }
    }
}
