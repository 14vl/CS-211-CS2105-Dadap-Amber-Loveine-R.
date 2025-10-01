import java.util.Scanner;

public class AptxVault {
    public static int[] getPasscodes(Scanner sherry) {
        int[] codes = new int[3];
        for (int i = 0; i < 3; i++){
            System.out.print("Enter passcode " + (i+1) + ": ");
            codes[i] = sherry.nextInt();
        }
        return codes;
    }

    public static boolean isValidPasscodes(int[] codes) {
        for (int code : codes){
            if ((code < 450) || (code > 3000)){
                return false;
            }
        }
        return true;
    }   

    public static int sum(int[] codes) {
        int total = 0;
        for (int code : codes){
            total += code;   
        }
        return total;
    }
    
    public static void main(String[] args) {
        Scanner sherry = new Scanner(System.in);

        int[] codes = getPasscodes(sherry);

        if (isValidPasscodes(codes) && (sum(codes) == 4869)){
            System.out.print("Vault unlocked with: " +codes[0]+ ", " + codes[1] + ", "+codes[2]);
        } else {
            System.out.println("Vault remains locked.");
        }
    }

}