package jpql.item;

import net.bytebuddy.asm.Advice;
import org.hibernate.Hibernate;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.util.Objects;

@Embeddable @Access(AccessType.FIELD)
public class Address {

    // Address
    @Column(length = 10)
    private String city;

    @Column(length = 20)
    private String street;

    @Column(length = 7)
    private String zipcode;


    public boolean isValid(){

        /**
         * 연관된 Business Logic
         * */

        return true;
    }

    protected Address() {}


    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }


    public String fullAddressIs(){
        return getCity()+getStreet()+getZipcode();
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getZipcode() {
        return zipcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Address address = (Address) o;

        if (!Objects.equals(city, address.city)) return false;
        if (!Objects.equals(street, address.street)) return false;
        return Objects.equals(zipcode, address.zipcode);
    }

    @Override
    public int hashCode() {
        int result = Objects.hashCode(city);
        result = 31 * result + (Objects.hashCode(street));
        result = 31 * result + (Objects.hashCode(zipcode));
        return result;
    }
}
