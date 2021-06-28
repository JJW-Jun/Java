package jpql.item;

import lombok.Data;

import javax.persistence.*;

@Entity @Data
public class User {

    @Id
    private long id;
    private String name;

}

class Main {
    public static void main(String args[]) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        try {
            User user = new User();
            String id = null;
            System.out.println("=======================================================");
            System.out.println("user.getId()= " + user.getId());
            System.out.println("=======================================================");
            user.setName("user");
            em.persist(user);

            tx.commit();

        } catch (Exception e) {

            tx.rollback();
        } finally {

            em.close();
        }

        emf.close();
    }
}