/**
 * Find pair of numbers whose sum is equal to a given number
 * -----Brute force method
 */
public class PairsSum {
    public static void main(String[] args) {
        System.out.println("--------Beginning Test Method----");
        int[] nums = new int[]{4, 5, 9, 7, 2, 3};
        int number = 9;
        findTwoNumbers(nums, number);
        System.out.println("--------Ending Test Method----");

    }

    public static void findTwoNumbers(int[] nums, int number) {
        System.out.println("::::Beginning of findTwoNumbers():::::");
        int first = 0;
        int sec = 0;
        String valid = null;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (number == (nums[i] + nums[j])) {
                    first = nums[i];
                    sec = nums[j];
                    valid = "valid";
                }
            }
        }

        if (valid == null) {
            System.out.println("No pair found!!");

        } else {
            System.out.println("The First number is: " + first);
            System.out.println("The Second number is: " + sec);
        }

    }
}