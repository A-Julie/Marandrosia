public class GestionInventaire {

    public static int[] ajusterInventaire(int[] inventaire, int nouvelleTaille) {

        int[] nouveau = new int[nouvelleTaille];

        // On copie UNIQUEMENT jusqu'à la limite du tableau original
        int limite = Math.min(nouvelleTaille, inventaire.length);

        for (int i = 0; i < limite; i++) {
            nouveau[i] = inventaire[i];
        }

        return nouveau;
    }
}
