package jpql;

import jpql.etc.Family;
import jpql.item.Address;
import jpql.item.BaseEntity;
import jpql.item.Item;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Member {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "MEMBER_ID")
  private Long id;

  @Column(name = "MEMBER_NAME")
  private String memberName;

  @ManyToOne
  @JoinColumn(name = "TEAM_ID")
  private Team team;

  public void setTeam(Team team) {
    if(this.team != null){
      this.team.getMembers().remove(this);
    }
    this.team = team;
    if(team != null){
      team.getMembers().add(this);
    }
  }

  protected Member() {}
}
