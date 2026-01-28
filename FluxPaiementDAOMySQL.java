import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FluxPaiementDAOMySQL implements FluxPaiementDAO {

    private Connection connection;

    public FluxPaiementDAOMySQL(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void ajouterFlux(FluxPaiement f) {
        String sql = "INSERT INTO flux_paiement (id, montant, royaume) VALUES (?, ?, ?)";

        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, f.getId());
            ps.setDouble(2, f.getMontant());
            ps.setString(3, f.getRoyaume().getNom());
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<FluxPaiement> getTousLesFlux() {
        List<FluxPaiement> flux = new ArrayList<>();
        String sql = "SELECT * FROM flux_paiement";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                flux.add(
                        new FluxPaiement(
                                rs.getString("id"),
                                rs.getDouble("montant"),
                                null // simplifié
                        )
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flux;
    }

    @Override
    public double totalFlux() {
        String sql = "SELECT SUM(montant) FROM flux_paiement";

        try (Statement st = connection.createStatement();
             ResultSet rs = st.executeQuery(sql)) {

            if (rs.next()) {
                return rs.getDouble(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return 0;
    }
}
