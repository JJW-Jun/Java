package jpql.item;

import jpql.Member;
import lombok.Data;

import javax.persistence.*;

@Entity @Data
public class AddressEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Address address;


    public AddressEntity(String newCity, String street, String zipcode) {
        this.address = new Address(newCity, street, zipcode);
    };

    protected AddressEntity() {};




}
