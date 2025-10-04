import java.util.Scanner;

public class EdenAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of grades: ");
        int n = sc.nextInt();

        int[] grades = new int[n];
        System.out.print("Enter grades: ");
        for (int i = 0; i < n; i++) {
            grades[i] = sc.nextInt(); 
        }

        int[] passed = new int[n];
        int[] failed = new int[n];
        int passedCount = 0;
        int failedCount = 0;

        for (int i = 0; i < n; i++) {
            int grade = grades[i];
            int rounded = grade;

            if (grade >= 78) {
                int nextMultipleOf5 = ((grade / 5) + 1) * 5;
                if (nextMultipleOf5 - grade < 3) {
                    rounded = nextMultipleOf5;
                }
            }

            if (rounded >= 80) {
                passed[passedCount++] = rounded;
            } else {
                failed[failedCount++] = rounded;
            }
        }
        System.out.println("");
        if (passedCount > 0) {
            System.out.print("Passed: ");
            for (int i = 0; i < passedCount; i++) {
                System.out.print(passed[i] + " ");
            }
            System.out.println();
        }

        if (failedCount > 0) {
            System.out.print("Failed: ");
            for (int i = 0; i < failedCount; i++) {
                System.out.print(failed[i] + " ");
            }
            System.out.println();
        }

        int stellaStars = passedCount / 3;
        int tonitrusBolts = failedCount;

        System.out.println("\nStella Stars: " + stellaStars);
        System.out.println("Tonitrus Bolts: " + tonitrusBolts);
    }
}
