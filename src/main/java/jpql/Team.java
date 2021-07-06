package jpql;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity @ToString(exclude = "members") @Setter @Getter
public class Team {

    @Id
    @GeneratedValue
    @Column(name = "TEAM_ID")
    private Long id;
    private String name;


    @OneToMany(mappedBy = "team") @BatchSize(size = 5)
    private List<Member> members = new ArrayList<>();


}

