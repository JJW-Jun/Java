package jpql.etc;

import jpql.item.Address;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Setter @Getter
@Table(name = "ORDERS")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int orderAmount;

    @Embedded
    private Address address;



}
