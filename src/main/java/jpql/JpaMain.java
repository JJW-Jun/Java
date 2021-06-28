package jpql;

import jpql.item.Address;
import jpql.item.Category;
import jpql.item.MemberType;
import lombok.Data;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.List;
import java.util.stream.Collectors;

public class JpaMain {
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            Company companyA = new Company();
            companyA.setName("companyA");
            em.persist(companyA);

            Team teamA = new Team();
            teamA.setName("teamA");
            em.persist(teamA);

            Member memberA = new Member();
            memberA.setMembername("memberA");
            memberA.setAge(new Age(21));
            memberA.setTeam(teamA);
            memberA.setCompany(companyA);
            memberA.setType(MemberType.USER);


            memberA.setAddress(new Address("Busan", "Namcheon", "103"));

            em.persist(memberA);

            em.flush();
            em.clear();

            Member findMember = em.find(Member.class, 1L);
            List<Member> members = em.createQuery("select m from Member m", Member.class).getResultList();


            System.out.println("====================");
            long manLiveInBusan20s = members.stream()
                                            .filter(Address::isBusan)
                                            .filter(Age::is20s)
                                            .map(MemberDto::new)
                                            .count();
            System.out.println("====================");
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
        } finally {
            em.close();
        }
        emf.close();
    }

    @Data
    static class MemberDto {
        private Age age;
        private Address address;

        public MemberDto(Member member) {
            this.age = member.getAge();
            this.address = member.getAddress();
        }

    }
}