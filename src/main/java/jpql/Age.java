//package jpql;
//
//import lombok.Getter;
//
//import javax.persistence.Embeddable;
//
//@Embeddable @Getter
//public class Age {
//
//    private int age;
//
//    public Age(int age) {
//        this.age = age;
//    }
//
//    public Age() {
//
//    }
//
//    public static boolean is10s(Member member){
//        return member.getAge().getAge()>= 10 && member.getAge().getAge()<20;
//    }
//
//    public static boolean is20s(Member member){
//        return member.getAge().getAge()>= 20 && member.getAge().getAge()<30;
//    }
//
//
//    public boolean age30s(Member member){
//        return member.getAge().getAge()>= 30 && member.getAge().getAge()<40;
//    }
//
//
//    public boolean age40s(Member member){
//        return member.getAge().getAge()>= 40 && member.getAge().getAge()<50;
//    }
//
//}