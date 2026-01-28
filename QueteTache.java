public class QueteTache {
    private String description;
    private int difficulte;

    public QueteTache(String description,int difficulte){
        this.description = description;
        this.difficulte = difficulte;
    }

    public String getDescription() { return description; }
    public int getDifficulte() { return difficulte; }

    public QueteTache(QueteTache autre) {
        this.description = autre.description;
        this.difficulte = autre.difficulte;
    }

    public void changerDifficulte(int nouvelleDiff) {
        this.difficulte = nouvelleDiff;
    }

    public QueteTache cloner() {
        return new QueteTache(this);
    }
}
