import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LibraryServices {
    Scanner input = new Scanner(System.in);
    ArrayList<BookInfo> booklist = new ArrayList<>();

    void addBook() {
        System.out.print("How many books do you want to add?: ");
        int no = input.nextInt();
        input.nextLine();

        for (int i = 0; i < no; i++) {
            System.out.println("\nAdd Details for Book " + (i + 1));
            System.out.print("Book Name: ");
            String bname = input.nextLine();
            System.out.print("Book Author: ");
            String bauthor = input.nextLine();
            System.out.print("Book Genre: ");
            String bgenre = input.nextLine();

            BookInfo b1 = new BookInfo(bname, bgenre, bauthor);
            booklist.add(b1);
        }
        System.out.println("\nBooks Added Successfully!");
    }

    void getBook() {
        System.out.print("\nEnter Book Name: ");
        String bn = input.nextLine();
        boolean found = false;

        for (BookInfo b : booklist) {
            if (b.name.equalsIgnoreCase(bn)) {
                System.out.println("\nBook Details:");
                System.out.println("Book Name: " + b.name);
                System.out.println("Book Author: " + b.author);
                System.out.println("Book Genre: " + b.gener);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nBook Not Found!\n");
        }
    }

    void changeBook() {
        System.out.print("\nEnter Book Name: ");
        String bn = input.nextLine();
        boolean found = false;

        for (BookInfo b : booklist) {
            if (bn.equalsIgnoreCase(b.name)) {
                System.out.print("Enter new book name: ");
                b.name = input.nextLine();
                System.out.print("Enter new book author: ");
                b.author = input.nextLine();
                System.out.print("Enter new book genre: ");
                b.gener = input.nextLine();

                System.out.println("\nBook Changed Successfully!\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found!\n");
        }
    }

    void delBook() {
        System.out.print("\nEnter Book Name to Delete: ");
        String bn = input.nextLine();

        Iterator<BookInfo> it = booklist.iterator();
        boolean found = false;

        while (it.hasNext()) {
            BookInfo b = it.next();
            if (bn.equalsIgnoreCase(b.name)) {
                it.remove();
                System.out.println("\nRemoved " + b.name + " Successfully\n");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Book Not Found!\n");
        }
    }

    void showGenres() {
        ArrayList<String> genres = new ArrayList<>();
        for (BookInfo e : booklist) {
            if (!genres.contains(e.gener.toUpperCase())) {
                genres.add(e.gener.toUpperCase());
            }
        }

        System.out.println("\nGenres Available: " + genres.size());
        for (String g : genres) {
            System.out.println(g);
        }
        System.out.println();
    }

    void searchBygenre() {
        System.out.print("\nEnter Genre: ");
        String g = input.nextLine();
        boolean found = false;

        for (BookInfo e : booklist) {
            if (g.equalsIgnoreCase(e.gener)) {
                System.out.println("\nBook Name: " + e.name);
                System.out.println("Book Genre: " + e.gener);
                found = true;
            }
        }

        if (!found) {
            System.out.println("\nGenre Not Found!\n");
        }
    }

    void searchByauthor() {
        System.out.print("\nEnter Author: ");
        String a = input.nextLine();
        boolean found = false;

        for (BookInfo e : booklist) {
            if (a.equalsIgnoreCase(e.author)) {
                System.out.println("\nBook Name: " + e.name);
                System.out.println("Book Genre: " + e.gener);
                System.out.println("Book Genre: " + e.author);
                found = true;
            }
        }

        if (!found) {
            System.out.println("\nAuthor Not Found!\n");
        }
    }
}
