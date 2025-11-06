import java.util.Scanner;

public class SiakadFor12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        double grade, highest, lowest; 
        highest = 0;   
        lowest = 100;  

        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the score for student " + i + " : " );
            grade = sc.nextDouble();

            if (grade > highest) {
                highest = grade;
            }

            if (grade < lowest) {
                lowest = grade;
            }
        }

        System.out.println("The highest grade: " + highest);
        System.out.println("The lowest grade: " + lowest);

        sc.close();
    }
}