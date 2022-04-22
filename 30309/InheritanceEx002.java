class Person {
    String name = "홍길동";
    void sleep() {
        System.out.println("SLEEP");
    }
}
class Student extends Person {
    void sleep() {
        System.out.println("Good Night");
    }
}
public class InheritanceEx002 {
    public static void main(String[] args) {
        Student std = new Student();
        System.out.println(std.name);
        std.sleep();
    }
}