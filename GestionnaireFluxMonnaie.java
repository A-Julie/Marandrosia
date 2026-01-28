import java.util.ArrayList;

public class GestionnaireFluxMonnaie {

    private ArrayList<FluxMonnaie> flux;
    private FluxMonnaieDAO dao;

    public GestionnaireFluxMonnaie() {
        this.flux = new ArrayList<>();
        this.dao = new FluxMonnaieDAO();
    }

    public void enregistrerFlux(FluxMonnaie f) {
        flux.add(f);
        dao.sauvegarderFlux(f);
    }

    public void afficherFlux(){
        for (FluxMonnaie f : flux){
            System.out.println(f);
        }
    }

    public double montantTotalConverti(){
        double total = 0;
        for (FluxMonnaie f : flux){
            total += f.montantConverti;
        }

        return total;
    }
}
