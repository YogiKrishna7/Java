import java.util.Scanner;

class Students {
    String name;
    int rollnum;
    int marks;

    Students(String n, int r, int m) {
        this.name = n;
        this.rollnum = r;
        this.marks = m;
    }
}

public class StudentStatus {
    Scanner input = new Scanner(System.in);
    Students[] list;

    StudentStatus() {
        System.out.println("Number of students you want to add: ");
        int no = input.nextInt();

        list = new Students[no];
        for (int i = 0; i < no; i++) {
            System.out.println("Enter student name: ");
            String name = input.next();
            System.out.println("Enter roll number: ");
            int roll = input.nextInt();
            System.out.println("Enter marks: ");
            int mar = input.nextInt();

            list[i] = new Students(name, roll, mar);
        }
    }

    void printList() {
        for (Students s : list) {
            System.out.println("Name: " + s.name);
            System.out.println("Roll Number: " + s.rollnum);
            System.out.println("Marks: " + s.marks);

            if (s.marks <= 35) {
                System.out.println("Status: Failed");
            } else if (s.marks >= 80) {
                System.out.println("Status: Great");
            } else if (s.marks >= 50 && s.marks <= 75) {
                System.out.println("Status: Average");
            } else {
                System.out.println("Status: Passed");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        StudentStatus s1 = new StudentStatus();
        s1.printList();
    }
}
