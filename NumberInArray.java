import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Checking if an array contains a specific number
 *
 * @author vkiprono
 */
public class NumberInArray {

    public static void main(String[] args) {
        System.out.println("-----Checking if a number is in an array-----");
        int[] nums = new int[]{45, 6, 89, 7, 5, 9, 55, 65};
        System.out.println("Please enter the number to check:?");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.println("Does the number: " + input + " in the array? " + checkNumber(nums, input));

    }

    public static boolean checkNumber(int[] nums, int number) {
        System.out.println("Beginning of checkNumber()--");

        Arrays.sort(nums);
        System.out.println("Sorted arrays is: " + Arrays.toString(nums));
        for (int num : nums) {
            if (num == number) {
                return true;
            }
        }
        System.out.println("Beginning of checkNumber()--");
        return false;

    }


}
