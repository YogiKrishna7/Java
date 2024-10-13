/* 
5) Write a Java program to create a class called "Person" with a name and age attribute.
Create two instances of the "Person" class, set their attributes using the constructor, and
print their name and age. 
*/

class Person {

    String name;
    int age;

    public Person(String n, int a) {
        this.name = n;
        this.age = a;

        System.out.println("Name: " + name + " Age: " + age);
    }

}

public class Program5 {

    public static void main(String[] args) {
        Person person1 = new Person("Yogi", 22);
        Person person2 = new Person("Prasad", 21);
    }
}
