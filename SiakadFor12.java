import java.util.Scanner;

public class SiakadFor12{
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);

        double grade, highest, lowest;
        int pass = 0, fail = 0;

        highest = 0;
        lowest = 100;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the grade of the " + i + " student: ");
            grade = sc.nextDouble();

            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }

            if (grade >= 60) {
                pass++;
            } else {
                fail++;
            }
        }

        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);
        System.out.println("Number of students passed: " + pass);
        System.out.println("Number of students failed: " + fail);

        sc.close();
    }
}