import java.time.LocalDateTime;

public class FluxMonnaie {

    private double montantSoucre;
    private double montantConverti;
    private  String royaumeSource;
    private  String royaumeCible;
    private LocalDateTime date;

    public FluxMonnaie(double montantSoucre, double montantConverti, String royaumeSource, String royaumeCible){
        this.montantSoucre = montantSoucre;
        this.montantConverti = montantConverti;
        this.royaumeSource = royaumeSource;
        this.royaumeCible = royaumeCible;
        this.date = LocalDateTime.now();
    }

    @Override
    public  String toString (){
        return "[" + date + "] " + royaumeSource + " -> " + royaumeCible + " : " + montantSoucre + " -> " + montantConverti;
    }
}
