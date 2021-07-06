package jpql.item;

import lombok.Setter;

import javax.persistence.Embeddable;

@Embeddable @Setter
public class Address {

    // Address
    private String city;
    private String street;
    private String zipcode;

    protected Address() {
    }

    public Address(String city, String street, String zipcode) {
        this.city = city;
        this.street = street;
        this.zipcode = zipcode;
    }

}




//    public boolean isValid(){
//
//        /**
//         * 연관된 Business Logic
//         * */
//
//        return true;
//    }



    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
//        Address address = (Address) o;
//
//        if (!Objects.equals(city, address.city)) return false;
//        if (!Objects.equals(street, address.street)) return false;
//        return Objects.equals(zipcode, address.zipcode);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hashCode(city);
//        result = 31 * result + (Objects.hashCode(street));
//        result = 31 * result + (Objects.hashCode(zipcode));
//        return result;
//    }

