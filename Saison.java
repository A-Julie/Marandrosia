import java.util.ArrayList;

public class Saison {

    private String nom;
    private int temperature;
    private ArrayList<String> temps; // pluie, soleil…
    private boolean estActive;

    private Archipel archipel; // 🔥 Lien vers un archipel

    public Saison(String nom, int temperature, ArrayList<String> temps, boolean estActive, Archipel archipel) {
        this.nom = nom;
        this.temperature = temperature;
        this.temps = temps;
        this.estActive = estActive;
        this.archipel = archipel;
    }

    // Getters
    public String getNom() { return nom; }
    public int getTemperature() { return temperature; }
    public ArrayList<String> getTemps() { return temps; }
    public boolean isEstActive() { return estActive; }
    public Archipel getArchipel() { return archipel; }

    // Setters
    public void setNom(String nom) { this.nom = nom; }
    public void setTemperature(int temperature) { this.temperature = temperature; }
    public void setTemps(ArrayList<String> temps) { this.temps = temps; }
    public void setEstActive(boolean estActive) { this.estActive = estActive; }
    public void setArchipel(Archipel archipel) { this.archipel = archipel; }
}
