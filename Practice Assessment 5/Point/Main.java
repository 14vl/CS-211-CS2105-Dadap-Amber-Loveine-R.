import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter x: ");
        int x = scanner.nextInt();

        System.out.print("Enter y: ");
        int y = scanner.nextInt();

        Point point = new Point(x, y);

        point.printCoordinates();

        System.out.printf("%.2f%n",point.calculateDistance());
    }
}
