package pet.petshop.entity;


import javax.persistence.*;


@Entity
public class Productcategories {
    private Integer id;
    private String name;

    public Productcategories() {
        super();
        // TODO Auto-generated constructor stub
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
