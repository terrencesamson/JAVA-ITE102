import java.util.Scanner;
 
public class Studentsgrades {

    public static void main(String[] args) {
 
        Scanner input = new Scanner(System.in);
 
        // Declare and initialize a 3D array

        // 2 sections, 3 students, 3 subjects

        int[][][] grades = new int[2][3][3];
 
        String[] subjects = {

            "Java", "Database", "Networking"

        };
        
        double studentAverage;

        double sectionAverage;
 
        // Input student grades

        System.out.println("STUDENT GRADE MANAGEMENT SYSTEM");

        System.out.println("================================");
 
        for (int section = 0; section < 2; section++) {
 
            System.out.println("\nSECTION " + (section + 1));
 
            for (int student = 0; student < 3; student++) {
 
                System.out.println("\nStudent " + (student + 1));
 
                for (int subject = 0; subject < 3; subject++) {
 
                    System.out.print(

                        subjects[subject] + " Grade: "

                    );
 
                    grades[section][student][subject] =

                        input.nextInt();

                }

            }

        }
 
        // Display grades and calculate averages

        System.out.println("\n\nSTUDENT GRADE REPORT");

        System.out.println("====================");
 
        for (int section = 0; section < 2; section++) {
 
            System.out.println("\nSECTION " + (section + 1));

            System.out.println("----------------------------");
 
            double totalSection = 0;
 
            for (int student = 0; student < 3; student++) {
 
                double totalStudent = 0;
 
                System.out.println(

                    "\nStudent " + (student + 1)

                );
 
                for (int subject = 0; subject < 3; subject++) {
 
                    int grade = grades[section][student][subject];
 
                    System.out.println(

                        subjects[subject] + ": " + grade

                    );
 
                    totalStudent += grade;

                }
 
                // Calculate student average

                studentAverage = totalStudent / 3;
 
                System.out.printf(

                    "Student Average: %.2f%n",

                    studentAverage

                );
 
                totalSection += totalStudent;

            }
 
            // Calculate section average

            sectionAverage = totalSection / 9;
 
            System.out.printf(

                "\nSection Average: %.2f%n",

                sectionAverage

            );

        }
 
        input.close();

    }

}

 