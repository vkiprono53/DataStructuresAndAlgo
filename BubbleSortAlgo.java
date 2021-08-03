import java.util.Arrays;

/**
 * This is an illustration of a bubblesort algorithm
 */

public class BubbleSortAlgo {
    public static void bubbleSort(int[] nums) {
        System.out.println("------Beginning of bubbleSort--- ");
        int temp = 0;
        System.out.println("----Beginning of for loop----");
        for (int pass= 0; pass < nums.length - 1; pass++) {
            for (int i = 0; i < nums.length -1-pass; i++) {
                if (nums[i] > nums[i + 1]) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
            System.out.println("Arrangement after each iteration");
            System.out.println(Arrays.toString(nums));

        }
        System.out.println("----End of  loop----");
    }

    //Main method - Driver Method:
    public static void main(String[] args) {
        System.out.println("Inside the main method");
        int[] numbers = {14, 33, 27, 35, 10};
        bubbleSort(numbers);
    }
}
