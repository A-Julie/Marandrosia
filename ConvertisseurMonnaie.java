public class ConvertisseurMonnaie {

    public static double convertirBronzeEnOr(double bronze)
            throws MonnaieInvalideException {

        if (bronze < 0) {
            throw new MonnaieInvalideException(
                    "Impossible de convertir une quantité négative de monnaie."
            );
        }

        return bronze / 10.0;
    }
}
