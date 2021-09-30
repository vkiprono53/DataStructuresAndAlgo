import java.util.Scanner;

public class ScannerMax {
    public static void main(String[] args) {
        System.out.println("----Beginning of scanner----");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");

        if (input.hasNext()) {
            int first = input.nextInt();
            System.out.println("The first number is " + first);
            if (input.hasNext()) {
                System.out.println("Enter the second number: ");

                int seco = input.nextInt();
                System.out.println("The second number is: " + seco);
                System.out.println("The maximum number between " + first + " and " + seco + " is: " + Math.max(first, seco));
            }
        }


    }
}
