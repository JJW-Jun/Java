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
      //      Team team = new Team();
      //      team.setName("teamA");
      //
      //      em.persist(team);
      //      Member memberA = new Member();
      //      memberA.setMemberName("memberA");
      //      memberA.setTeam(team);
      //      em.persist(memberA);
      //
      //      em.flush();
      //      em.clear();
      Member findMember = em.find(Member.class, 1L);
      System.out.println(findMember.toString());

      //      em.createQuery("select m from Team t inner join t.members m", Member.class)
      //          .getResultList()
      //          .forEach(System.out::println);
      //      em.createQuery("select t.members from Team t ", Member.class)
      //              .getResultList()
      //      .forEach(System.out::println);

      //      System.out.println("===============================================================");
      //      Team findTeam = em.find(Team.class, 1L);
      //      List<Member> results = findTeam.getMembers();
      //      results.forEach(System.out::println);

      tx.commit();
    } catch (Exception e) {
      tx.rollback();
    } finally {
      em.close();
    }
    emf.close();
  }
}
