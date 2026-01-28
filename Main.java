import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // On crée Thalasside en utilisant le constructeur disponible (population)
        Thalasside thalasside = new Thalasside(500000);

        // Archipels de Thalasside (sans saisons pour l'instant)
        Archipel[] archipels = {
                new Archipel("Pharos", null, thalasside),
                new Archipel("Thalassia", null, thalasside),
                new Archipel("Eosios", null, thalasside)
        };

        System.out.print("Entre ton nom, voyageur : ");
        String nom = sc.nextLine();

        System.out.println("\nBienvenue " + nom + " dans le monde de Marandrosia !");
        System.out.println("Choisis ton archipel :");

        // afficher menu
        for (int i = 0; i < archipels.length; i++) {
            System.out.println((i + 1) + " - " + archipels[i].getNom());
        }

        // choix utilisateur (avec protection minimale)
        int choix = 1;
        try {
            choix = sc.nextInt();
        } catch (Exception e) {
            System.out.println("Entrée invalide, choix par défaut : 1");
            sc.nextLine(); // vide le buffer si nécessaire
        }
        if (choix < 1 || choix > archipels.length) {
            System.out.println("Choix hors limites, sélection du premier archipel.");
            choix = 1;
        }
        sc.nextLine(); // clean buffer

        Archipel selection = archipels[choix - 1];

        System.out.println("\nTu as choisi l'archipel de " + selection.getNom() + " !");
        System.out.println("Ce territoire appartient au royaume de : " + selection.getRoyaume().getNom());

        // ---------- Intégration : création d'une quête liée à l'archipel ----------
        System.out.println("\nTu reçois une nouvelle quête dans l'archipel !");
        Quete q = new Quete("Découverte de " + selection.getNom());

        // On ajoute des tâches (copies faites dans Quete.ajouterTache)
        q.ajouterTache(new QueteTache("Explorer les côtes de " + selection.getNom(), 2));
        q.ajouterTache(new QueteTache("Parler à un ancien de " + selection.getRoyaume().getNom(), 1));
        q.ajouterTache(new QueteTache("Récupérer une relique près du phare", 1));

        System.out.println("\nQuête : " + q.getNom());
        System.out.println("Tâches :");
        q.afficherTaches();

        System.out.println("\nNombre total de tâches : " + q.nombreDeTaches());

        // ---------- Optionnel : démonstration d'ajustement d'inventaire ----------
        // (montre l'usage de GestionInventaire si tu veux tester)
        int[] sac = {1, 2, 3, 4}; // valeurs magiques d'artefacts
        int[] sacAgrandit = GestionInventaire.ajusterInventaire(sac, 8);
        System.out.print("\nContenu du sac agrandi (valeurs) : ");
        for (int v : sacAgrandit) {
            System.out.print(v + " ");
        }
        System.out.println();

        // Fin
        System.out.println("\nBonne aventure, " + nom + " !");

        // ---------- Partie D : conversion de monnaie ----------
        System.out.println("\nTu voyages vers un autre royaume...");

// Le joueur possède une certaine quantité de bronze
        double monnaieBronze = 50;

        System.out.println("Tu possèdes " + monnaieBronze + " pièces de bronze.");

        try {
            double monnaieOr = ConvertisseurMonnaie.convertirBronzeEnOr(monnaieBronze);
            System.out.println("Après conversion, tu obtiens " + monnaieOr + " pièces d'or.");
        } catch (MonnaieInvalideException e) {
            System.out.println("Erreur de conversion : " + e.getMessage());
        }

        sc.close();
    }
}
