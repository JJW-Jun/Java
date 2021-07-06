package jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;

public class JpaMain {
  public static void main(String args[]) {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
    tx.begin();

    try {
      Team teamA = new Team();
      teamA.setName("teamA");
      em.persist(teamA);

      Team teamB = new Team();
      teamB.setName("teamB");
      em.persist(teamB);

      Team teamC = new Team();
      teamC.setName("teamC");
      em.persist(teamC);

      Team teamD = new Team();
      teamD.setName("teamD");
      em.persist(teamD);

      Team teamE = new Team();
      teamE.setName("teamE");
      em.persist(teamE);

      Member memberA = new Member();
      memberA.setMembername("memberA");
      memberA.setTeam(teamA);
      em.persist(memberA);

      Member memberB = new Member();
      memberB.setMembername("memberB");
      memberB.setTeam(teamB);
      em.persist(memberB);

      Member memberC = new Member();
      memberC.setMembername("memberC");
      memberC.setTeam(teamC);
      em.persist(memberC);

      Member memberD = new Member();
      memberD.setMembername("memberD");
      memberD.setTeam(teamD);
      em.persist(memberD);

      Member memberE = new Member();
      memberE.setMembername("memberE");
      memberE.setTeam(teamE);
      em.persist(memberE);

      em.flush();
      em.clear();

      String fetchJoin = "select t From Team t";
      List<Team> result =
          em.createQuery(fetchJoin, Team.class)
                  .setFirstResult(0)
                  .setMaxResults(5)
                  .getResultList();

      System.out.println("====================");
      for (Team team : result) {
        System.out.println("팀= " + team.getName() + ", 회원수=" + team.getMembers().size());
        for (Member member : team.getMembers()) {
          System.out.println("->member= " + member);
        }
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
