package jpql.item;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Address address;


    AddressEntity(String newCity, String street, String zipcode) {
        this.address = new Address(newCity, street, zipcode);
    }

    ;

    public AddressEntity() { }



}
