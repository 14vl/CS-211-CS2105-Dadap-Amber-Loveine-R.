import java.util.Scanner;

public class Sequences{
    public static void main(String[] args){
        Scanner fi = new Scanner(System.in);

        int[] seq = new int[5];
        System.out.print("Enter the first 5 elements of the sequence: ");
        for (int i = 0; i < 5; i++) {
            seq[i] = fi.nextInt();
        }

        System.out.print("Find which element: ");
        int n = fi.nextInt();

        boolean isArithmetic = true;
        boolean isGeometric = true;

        int d = seq[1] - seq[0];   
        int r = 0;
        if (seq[0] != 0) {
            r = seq[1] / seq[0]; 
        }

         for (int i = 1; i < 5; i++) {
            if (seq[i] - seq[i - 1] != d) {
                isArithmetic = false;
                break;
            }
        }

        for (int i = 1; i < 5; i++) {
            if (seq[i - 1] == 0 || seq[i] / seq[i - 1] != r || seq[i] % seq[i - 1] != 0) {
                isGeometric = false;
                break;
            }
        }

        if (isArithmetic) {
            int result = seq[0] + (n - 1) * d;
            System.out.println("Element " + n + " is " + result);
        } else if (isGeometric) {
            double result = seq[0] * Math.pow(r, n - 1);
            System.out.println("Element " + n + " is " + (int)result);
        } else {
            System.out.println("The sequence is neither arithmetic nor geometric.");
        }

        fi.close();
    }
}
