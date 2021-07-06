package jpql.etc;

import jpql.item.Item;
import lombok.Data;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity @DiscriminatorValue("M") @Setter
public class Movie extends Item {
    private String director;
    private String actor;
}
