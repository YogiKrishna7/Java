import java.util.*;

public class Enrollment {
    Scanner input = new Scanner(System.in);
    Map<Student, Course> sProfile = new HashMap<>();

    void addStudents() {
        System.out.println("No of students to add: ");
        int num = input.nextInt();
        input.nextLine();
        for (int i = 0; i < num; i++) {
            System.out.println("Student Name: ");
            String sname = input.nextLine();
            System.out.println("Student Age: ");
            int sage = input.nextInt();
            System.out.println("Student Roll Number: ");
            int sroll = input.nextInt();
            input.nextLine();
            System.out.println("Student Email: ");
            String smail = input.nextLine();

            Student s1 = new Student(sname, sroll, sage, smail);

            System.out.println("Course Name: ");
            String cname = input.nextLine();
            System.out.println("Course ID: ");
            int cid = input.nextInt();
            System.out.println("Course Duration: ");
            int cd = input.nextInt();
            input.nextLine();

            Course c1 = new Course(cid, cname, cd);

            sProfile.put(s1, c1);
        }
    }

    void removeStudents() {
        System.out.println("Enter Student Name: ");
        String name = input.nextLine();
        boolean done = sProfile.keySet().removeIf((i) -> i.name.equals(name));

        if (done) {
            System.out.println("Student " + name + " removed!");
        } else {
            System.out.println("Student Not Found!");
        }
    }

    void viewStudents() {
        sProfile.forEach((student, course) -> {
            System.out.println("Student Name: " + student.name);
            System.out.println("Student Age: " + student.age);
            System.out.println("Student Roll Number: " + student.rollno);
            System.out.println("Student Email: " + student.email);

            System.out.println("Course Name: " + course.courseName);
            System.out.println("Course ID: " + course.courseId);
            System.out.println("Course Duration (in years): " + course.courseDuration);
        });
    }

    void updateStudent() {
        System.out.println("Enter Student Name: ");
        String name = input.nextLine();
        boolean found = false;

        for (Student student : sProfile.keySet()) {
            if (student.name.equals(name)) {
                System.out.println("Enter age to update: ");
                int newAge = input.nextInt();
                student.setAge(newAge);
                input.nextLine();

                System.out.println("Enter Email to update: ");
                String newEmail = input.nextLine();
                student.setEmail(newEmail);

                System.out.println("Student updated.");
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    void searchByname() {
        System.out.println("Enter Student Name to search: ");
        String searchName = input.nextLine();
        System.out.println("Enter Course Name: ");
        String courseName = input.nextLine();

        boolean found = false;

        for (Map.Entry<Student, Course> entry : sProfile.entrySet()) {
            Student student = entry.getKey();
            Course course = entry.getValue();

            if (student.name.equals(searchName) && course.courseName.equals(courseName)) {
                System.out.println("Student Name: " + student.name);
                System.out.println("Student Age: " + student.age);
                System.out.println("Student Roll Number: " + student.rollno);
                System.out.println("Student Email: " + student.email);

                System.out.println("Course Name: " + course.courseName);
                System.out.println("Course ID: " + course.courseId);
                System.out.println("Course Duration (in years): " + course.courseDuration);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student and course combination not found.");
        }
    }

    void searchBycourse() {
        System.out.println("Enter Course Name: ");
        String courseName = input.nextLine();

        boolean found = false;

        for (Map.Entry<Student, Course> entry : sProfile.entrySet()) {
            Student student = entry.getKey();
            Course course = entry.getValue();

            if (course.courseName.equals(courseName)) {
                System.out.println("Student Name: " + student.name);
                System.out.println("Student Age: " + student.age);
                System.out.println("Student Roll Number: " + student.rollno);
                System.out.println("Student Email: " + student.email);

                System.out.println("Course Name: " + course.courseName);
                System.out.println("Course ID: " + course.courseId);
                System.out.println("Course Duration (in years): " + course.courseDuration);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Student and course combination not found.");
        }
    }

    public static void main(String[] args) {
        Enrollment enrollment = new Enrollment();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n==========================");
            System.out.println("     STUDENT ENROLLMENT   ");
            System.out.println("==========================");
            System.out.println("Choose an option:");
            System.out.println("1. Add Students");
            System.out.println("2. View Students");
            System.out.println("3. Remove Student");
            System.out.println("4. Update Student");
            System.out.println("5. Search by Student Name and Course");
            System.out.println("6. Search by Course Name");
            System.out.println("7. Exit");
            System.out.print("Your choice: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    enrollment.addStudents();
                    break;
                case 2:
                    enrollment.viewStudents();
                    break;
                case 3:
                    enrollment.removeStudents();
                    break;
                case 4:
                    enrollment.updateStudent();
                    break;
                case 5:
                    enrollment.searchByname();
                    break;
                case 6:
                    enrollment.searchBycourse();
                    break;
                case 7:
                    System.out.println("Exiting.");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

}
