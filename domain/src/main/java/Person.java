import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String firstName;

    private String lastName;

    private String nickname;

    private List<Long> areasOfDevelopment;

    private List<Long> objectivesCodes;

    protected Person(){}

    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickname = "";
        this.areasOfDevelopment = new ArrayList<>();
        this.objectivesCodes = new ArrayList<>();
    }
}
