public class Archipel {

    private String nom;
    private Saison[] saisons;
    private Royaume royaume; // 🔥 Lien vers le royaume auquel il appartient

    public Archipel(String nom, Saison[] saisons, Royaume royaume) {
        this.nom = nom;
        this.saisons = saisons;
        this.royaume = royaume;
    }

    public String getNom() { return nom; }
    public Saison[] getSaisons() { return saisons; }
    public Royaume getRoyaume() { return royaume; }

}
