import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = sp.nextInt();

        int first = 0, second = 1;

        System.out.print("Fibonacci Series: ");
        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }

        sp.close();
    }
}