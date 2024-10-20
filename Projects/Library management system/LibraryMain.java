import java.util.Scanner;

public class LibraryMain {
    public static void main(String[] args) {
        LibraryServices library = new LibraryServices();
        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- Library Management System ---");
            System.out.println("1. Add Book");
            System.out.println("2. Get Book by Name");
            System.out.println("3. Change Book Details");
            System.out.println("4. Delete Book");
            System.out.println("5. Show All Genres");
            System.out.println("6. Search Books by Genre");
            System.out.println("7. Search Books by Author");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    library.addBook();
                    break;
                case 2:
                    library.getBook();
                    break;
                case 3:
                    library.changeBook();
                    break;
                case 4:
                    library.delBook();
                    break;
                case 5:
                    library.showGenres();
                    break;
                case 6:
                    library.searchBygenre();
                    break;
                case 7:
                    library.searchByauthor();
                    break;
                case 8:
                    System.out.println("\nGoodbye!");
                    break;
                default:
                    System.out.println("\nInvalid choice, please try again.");
            }
        } while (choice != 8);
    }
}
