import java.util.Scanner;
public class SiakadFor16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int passed = 0;
        int failed = 0;
        double grade;
        double highest = 0;
        double lowest = 100;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Enter grade of the " + i + " student: ");
            grade = sc.nextDouble();
            if (grade >= 60) {
                passed++;
            } else {
                failed++;
            }
            }
            if (grade > highest) {
                highest = grade;
            }
            if (grade < lowest) {
                lowest = grade;
            }
        }
        System.out.println("Highest grade: " + highest);
        System.out.println("Lowest grade: " + lowest);
        System.out.println("Number of students who passed: " + passed);
        System.out.println("Number of students who failed: " + failed);
    }
    
}
