/**
 * Finding the smallest and largest numbers in an array
 */
public class LargestAndSmallest {
    public static void main(String[] args) {
        System.out.println("-----Beginning of the driver code");
        int[] nums = {78, 85, 99, 5, 22, 1, 56, 940, 2};
        findLargestAndSmallest(nums);
    }

    public static void findLargestAndSmallest(int[] nums) {
        System.out.println("---Beginning of findLargestAndSmallest() ");
        int min = nums[0];
        int max = nums[0];
        for (int num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        System.out.println("The minimum number is: " + min);
        System.out.println("The maximum number is: " + max);
        System.out.println("---End of findLargestAndSmallest() ");

    }
}
