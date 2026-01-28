import java.util.List;

public interface FluxPaiementDAO {

    void ajouterFlux(FluxPaiement f);

    List<FluxPaiement> getTousLesFlux();

    double totalFlux();
}
