/* 
6) Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and modify
the attributes using the setter methods and print the updated values. 
*/

class Dog {

    String name;
    String breed;

    public Dog(String dn, String db) {
        this.name = dn;
        this.breed = db;

        System.out.println("Dog name: " + this.name + " Breed: " + this.breed);
    }

    void modifyDetails(String mdn, String mdb) {
        this.name = mdn;
        this.breed = mdb;

        System.out.println("Dog name: " + this.name + " Breed: " + this.breed);
    }

}

public class Dog_Program6 {

    public static void main(String[] args) {
        Dog d1 = new Dog("Kittu", "Normal");

        Dog d2 = new Dog("Siri", "Normal");
        d2.modifyDetails("Bobby", "Bull Dog");
    }
}
