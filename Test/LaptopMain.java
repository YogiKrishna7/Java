import java.util.*;

public class LaptopMain {
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
