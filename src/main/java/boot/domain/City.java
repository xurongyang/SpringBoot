package boot.domain;


import javax.persistence.*;

/**
 * Created by xurongyang on 14/11/8.
 */

@Entity
@Table(name = "city")
public class City {

    @Id
    @GeneratedValue
    private long id;

    @Column(name = "name")
    private String name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
