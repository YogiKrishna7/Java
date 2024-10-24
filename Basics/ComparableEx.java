import java.util.*;

class Laptop implements Comparable<Laptop> {
    String brand;
    int ram;
    int price;

    public Laptop(String brand, int ram, int price) {
        this.brand = brand;
        this.ram = ram;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String toString() {
        return "Laptop [brand=" + brand + ", ram=" + ram + ", price=" + price + "]";
    }

    public int compareTo(Laptop o) {

        if (this.price > o.price) {
            return 1; // any positive value
        } else if (this.price < o.price) {
            return -1; // any negative value
        } else {
            return 0; // if both values are equal
        }

    }
}

public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Laptop> laps = new <Laptop>ArrayList();
        laps.add(new Laptop("Apple", 8, 60000));
        laps.add(new Laptop("Samsung", 16, 50000));
        laps.add(new Laptop("Acer", 16, 45000));
        laps.add(new Laptop("Asus", 16, 80000));
        laps.add(new Laptop("HP", 8, 45000));
        laps.add(new Laptop("Dell", 12, 50000));
        laps.add(new Laptop("Mi", 16, 40000));

        Collections.sort(laps);

        for (Laptop l : laps) {
            System.out.println(l);
        }
    }
}
