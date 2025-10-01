import java.util.Scanner;

public class CoffeePoirot {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] orders = new int[100];
        int count = 0;

        System.out.println("Welcome to Coffee Poirot, Beika City!");
        System.out.println("Please choose from our menu: ");

        System.out.println("1 - Coffee");
        System.out.println("2 - Tea");
        System.out.println("3 - Smoothie");
        System.out.println("4 - Exit (Checkout)");
        System.out.println(" ");

        while (true) {

            System.out.print("Enter your beverage: ");

            int choice = input.nextInt();
            if (choice == 4) {
                break;
            }

            if (choice > 4){
                System.out.println("Invalid choice, please try again.");
            }

            if (choice >=1 && choice <=3) {
                if (count < 100) {
                    orders[count] = choice;
                    count++;
                } else {
                    break;
                }
            } 

        }

        System.out.println(" ");

        for (int i = 0; i < count; i++){
            int order = orders[i];
            if (order == 1){
                System.out.println("Bitter but energizing!");
            } else if (order == 2){
                System.out.println("Soothing and calming!");
            } else if (order == 3){
                System.out.println("Cold and refreshing!");
            }
        }

        System.out.println(" ");
        System.out.println("Thank you for visiting Coffee Poirot!");
     
        input.close();
        
    }
}
