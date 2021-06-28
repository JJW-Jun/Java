package jpql;

import jpql.item.Address;
import jpql.item.AddressEntity;
import lombok.Data;

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
            Member memberA = new Member();
            memberA.setMembername("memberA");

            // Address
            memberA.setHomeAddress(new Address("Busan", "streetB", "051"));

            // History
            memberA.getAddressHistory().add(new AddressEntity("Seoul", "streetA", "02"));
            memberA.getAddressHistory().add(new AddressEntity("Wonju", "streetC", "031"));
            em.persist(memberA);


            em.flush();
            em.clear();



            System.out.println("====================");
            Member findMember = em.find(Member.class, 1L);
//            findMember.getAddressHistory().remove(new AddressEntity("Seoul", "streetA", "02"));
//            findMember.getAddressHistory().add(new AddressEntity("newCity", "streetZ", "051"));
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


//    @Data
//    static class MemberDto {
//        private Age age;
//        private Address address;
//
//        public MemberDto(Member member) {
//            this.age = member.getAge();
//            this.address = member.getAddress();
//        }
//
//    }
