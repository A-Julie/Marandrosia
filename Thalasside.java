public class Thalasside extends Royaume implements Influencable {

    public Thalasside() {
        super("Thalasside", 50000);
    }

    public Thalasside(int population) {
        super("Thalasside", population);
    }

    @Override
    public String decrire() {
        return "Thalasside : Royaume religieux sacré.";
    }

    @Override
    public String sanctifier() {
        return "Thalasside invoque les Marées Sacrées.";
    }

    @Override
    public void influencerArchipels() {
        System.out.println("Thalasside impose ses lois sacrées aux archipels.");
    }
}
