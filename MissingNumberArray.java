public class MissingNumberArray {
    public static void main(String[] args) {
        System.out.println("----Finding the missing number  the array-----");

        int[] nums = {1, 2, 3, 4, 5,6};
        int missingNum = getMissingNUmber(nums, 7);
        System.out.println("The missing number is: " + missingNum);
    }

    public static int getMissingNUmber(int[] nums, int count) {
        int expectedSum = count * ((count + 1) / 2);

        System.out.println("The expected sum is: " + expectedSum);

        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        System.out.println("The actual sum is: " + actualSum);
        return expectedSum - actualSum;

    }

}
