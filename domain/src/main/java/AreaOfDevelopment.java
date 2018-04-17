import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class AreaOfDevelopment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String areaName;

    private List<Long> defaultObjectivesCodes;

    private List<Long> chosenObjectivesCodes;

    protected AreaOfDevelopment(){}

    public AreaOfDevelopment(String areaName){
        this.areaName=areaName;
        this.defaultObjectivesCodes = new ArrayList<>();
        this.chosenObjectivesCodes = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public String getAreaName() {
        return areaName;
    }

    public List<Long> getDefaultObjectivesCodes() {
        return defaultObjectivesCodes;
    }

    public List<Long> getChosenObjectivesCodes() {
        return chosenObjectivesCodes;
    }
}