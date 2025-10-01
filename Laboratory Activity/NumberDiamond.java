import java.util.Scanner;

public class NumberDiamond {
    public static void main (String[] args){
        Scanner kaido = new Scanner(System.in);
        System.out.print("Enter value for n: ");
        int n = kaido.nextInt();

        //top half of diamond
        for(int i = 1; i <= n; i++){
            for (int j = i; j < n; j++){
                System.out.print(" ");
            }

            for (int m = 1; m <= (2*i - 1); m++){
                System.out.print(i);
            }
            System.out.println();
        }

        //bottom half
        for (int i = n - 1; i >= 1; i--){
            for (int j = n; j > i; j--){
                System.out.print(" ");
            }

            for (int m = 1; m <= (2*i - 1); m++){
                System.out.print(i);
            }

            System.out.println();

        }
        
        kaido.close();
    }
}