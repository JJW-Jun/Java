package jpql;

import jpql.item.Address;
import jpql.item.AddressEntity;
import lombok.Data;

import javax.persistence.*;
import java.util.*;


@Entity @Data
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "MEMBER_ID")
    private Long id;

    @Column(name = "MEMBER_NAME")
    private String membername;

    @Embedded
    private Address homeAddress;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "MEMBER_ID")
    private List<AddressEntity> addressHistory = new ArrayList<>();

    protected Member() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return Objects.equals(getId(), member.getId()) && Objects.equals(getMembername(), member.getMembername()) && Objects.equals(getHomeAddress(), member.getHomeAddress()) && Objects.equals(getAddressHistory(), member.getAddressHistory());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getMembername(), getHomeAddress(), getAddressHistory());
    }
}
