package jpql.item;

import jpql.Child;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Setter @Getter
public class Parent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Child> children = new ArrayList<>();

    public void addChild(Child child){
        /**
         *
         *  원래 자식이 이미 존재하는지 유무를 체크하는 등의
         *  추가적인 조치가 있어야 한다.
         *
         * */
        children.add(child);
        child.setParent(this);

    }

}
