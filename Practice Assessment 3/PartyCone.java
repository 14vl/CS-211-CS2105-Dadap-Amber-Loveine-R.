import java.util.Scanner;

public class PartyCone {
    public static void main(String[] args) {
        Scanner pc = new Scanner(System.in);

        System.out.print("Diameter of the cone's base: ");
        double diameter = pc.nextDouble();
        System.out.print("Height of the cone: ");
        double height = pc.nextDouble();

        double r = diameter / 2.0;
        double l = Math.sqrt(r * r + height * height);

        double surfaceArea = Math.PI * r * (r + l);
        double volume = (1.0 / 3.0) * Math.PI * r * r * height;

        System.out.printf("Surface Area is %.4f%n", surfaceArea);
        System.out.printf("Volume is %.4f%n", volume);

        pc.close();
    }
}
