package jpql.test;

import jpql.JpaMain;
import jpql.item.Address;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@SpringBootTest
@Transactional
@ContextConfiguration(classes = JpaMain.class)
class CategoryTest {
  @PersistenceContext
  EntityManager em;

  @Test
  @Commit
  void test() {
    Category categoryA = Category.createCategory("중식");
    Category categoryB = Category.createCategory("한식");
    Category categoryC = Category.createCategory("김밥");
    //
    em.persist(categoryA);
    em.persist(categoryB);
    //      em.persist(categoryC);
    Store storeA = Store.createStore(new Address("Seoul", "Mapo", "12341234"), "연우김밥");
    em.persist(storeA);
//    CategoryStore categoryStoreA = CategoryStore.createCategoryStore(categoryC, storeA);
  }
}
