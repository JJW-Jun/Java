package jpql;

import jpql.etc.Family;
import jpql.item.Address;
import jpql.item.BaseEntity;
import jpql.item.Item;
import lombok.Data;

import javax.persistence.*;

@Entity
public class Member {
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMemberName() {
    return memberName;
  }

  public void setMemberName(String memberName) {
    this.memberName = memberName;
  }

  public Team getTeam() {
    return team;
  }

  public void setTeam(Team team) {
    this.team = team;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "MEMBER_ID")
  private Long id;

  @Column(name = "MEMBER_NAME")
  private String memberName;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "TEAM_ID")
  private Team team;

  protected Member() {}

  @Override
  public String toString() {
    return "Member{" + "id=" + id + ", memberName='" + memberName + '\'' + ", team=" + team + '}';
  }
}
