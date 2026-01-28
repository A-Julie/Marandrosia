public class FluxPaiement {
    private String id;
    private double montant;
    private Royaume royaume;

    public FluxPaiement(String id, double montant, Royaume royaume) {
        this.id = id;
        this.montant = montant;
        this.royaume = royaume;
    }


    public String getId() {return id;}

    public double getMontant() {return montant;}

    public Royaume getRoyaume() {return royaume;}

    @Override
    public String toString() {
        return "FluxPaiement{" + "id='" + id + '\'' + ", montant=" + montant + ", royaume=" + royaume.getNom() + '}';
    }
}
