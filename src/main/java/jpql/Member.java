package jpql;

import jpql.item.Address;
import jpql.item.BaseEntity;
import lombok.Data;
import org.hibernate.annotations.BatchSize;

import javax.persistence.*;


@Entity @Data
public class Member extends BaseEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "MEMBER_NAME")
    private String membername;


    @ManyToOne(fetch = FetchType.LAZY) @JoinColumn(name = "members")
    private Team team;


    @Embedded
    private Address address;
    public void changeTeam(Team team){
        this.team = team;
        team.getMembers().add(this);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", membername='" + membername + '\'' +
                ", team=" + team +
                '}';
    }
}

