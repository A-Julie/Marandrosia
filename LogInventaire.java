import java.time.LocalDateTime;

public class LogInventaire {
    private LocalDateTime date;
    private String description;

    public LogInventaire(String description){
        this.date = LocalDateTime.now();
        this.description = description;
    }

    public LocalDateTime getDate() {
        return date;
    }


    @Override
    public String toString() {
        return "LogInventaire{" +
                "date=" + date +
                ", description='" + description + '\'' +
                '}';
    }
}
