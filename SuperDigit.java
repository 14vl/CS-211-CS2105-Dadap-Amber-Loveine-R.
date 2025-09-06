import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sp.nextInt();

        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }

        System.out.println("Super digit: " + n);
        sp.close();
    }
}