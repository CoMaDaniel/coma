import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Objective {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String objectiveName;

    private int progressIntervals;

    private int currentProgress;

    private boolean completed;

    protected Objective(){}

    public Objective (String objectiveName, int progressIntervals){
        this.objectiveName = objectiveName;
        this.progressIntervals = progressIntervals;
        this.currentProgress = 0;
        this.completed = false;
    }

    public Long getId() {
        return id;
    }

    public int getProgressIntervals() {
        return progressIntervals;
    }

    public int getCurrentProgress() {
        return currentProgress;
    }

    public String getObjectiveName() {
        return objectiveName;
    }
}
