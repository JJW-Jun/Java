package jpql.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Item {

  @Id
  @GeneratedValue
  private Long id;

  private String name;
  private int price;


}










