import java.time.LocalDateTime;
import java.util.ArrayList;

public class Inventaire {

    private int tailleMax;
    private ArrayList<String> objets;
    private ArrayList<LogInventaire> logs;

    public Inventaire(int tailleMax) {
        this.tailleMax = tailleMax;
        this.objets = new ArrayList<>();
        this.logs = new ArrayList<>();
    }

    public void ajouterObjet(String objet) {

        if (objets.size() < tailleMax) {
            objets.add(objet);
            logs.add(new LogInventaire("Ajout de l'objet : " + objet));
        } else {
            logs.add(new LogInventaire("Échec : inventaire plein lors de l'ajout de " + objet));
        }
    }

    public void retirerObjet(String objet) {

        if (objets.remove(objet)) {
            logs.add(new LogInventaire("Retrait de l'objet : " + objet));
        } else {
            logs.add(new LogInventaire("Échec : objet introuvable : " + objet));
        }
    }

    public String getLogs() {
        StringBuilder sb = new StringBuilder();

        for (LogInventaire log : logs) {
            sb.append(log.toString()).append("\n");
        }

        return sb.toString();
    }

    public ArrayList<LocalDateTime> getDatesLogs() {
        ArrayList<LocalDateTime> dates = new ArrayList<>();

        for (LogInventaire log : logs) {
            dates.add(log.getDate());
        }

        return dates;
    }
}
