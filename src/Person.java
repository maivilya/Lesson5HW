import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class Person {
    private final String name;
    private final String position;
    private final String email;
    private final int phonenumber;
    private final int salary;
    private final int age;

    public Person(String name, String position, String email, int phonenumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.age = age;
    }


    public int getAge() {
        return age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name = '" + name + '\'' +
                ", surname = '" + name + '\'' +
                ", position = '" + position + '\'' +
                ", email = '" + email + '\'' +
                ", phone number : " + phonenumber +
                ", salary = " + salary +
                ", age = " + age +
                '}';
    }
}