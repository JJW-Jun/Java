package jpql;

import jpql.item.Address;
import jpql.test.Category;
import jpql.test.CategoryStore;
import jpql.test.Store;

import javax.persistence.*;
import java.util.List;

public class JpaMain {
  public static void main(String args[]) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    tx.begin();
    try {
      Team team = new Team();
      team.setName("teamA");
      em.persist(team);
      System.out.println("===============================================");
      Member member = new Member();
      member.setMemberName("memberA");
      member.setTeam(team);
      em.persist(member);
      System.out.println("===============================================");
      Team findTeam = em.find(Team.class, team.getId());
      List<Member> members = findTeam.getMembers();
      System.out.println("====================");
      for (Member m : members) {
        System.out.println("m= " + m.getMemberName());
      }
      System.out.println("====================");
      tx.commit();
    } catch (Exception e) {
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
