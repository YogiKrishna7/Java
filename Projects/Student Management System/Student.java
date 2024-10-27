import java.util.*;

public class Student {
    String name;
    int rollno;
    int age;
    String email;

    public Student(String name, int rollno, int age, String email) {
        this.name = name;
        this.rollno = rollno;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", rollno=" + rollno + ", age=" + age + ", email=" + email + "]";
    }
}
