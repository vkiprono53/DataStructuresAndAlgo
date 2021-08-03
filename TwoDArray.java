public class TwoDArray {
    public static void main(String[] args) {
        System.out.println("*****2D******");
        int[] nums = {1,2,3,4};
        int[] numCLone = nums.clone();
        for (int clone: numCLone){
            System.out.println("The content of the clone is:::" + clone);
        }
        sum(nums);

    }

    public static void sum(int[] numbers){
        System.out.println("----Adding numbers----");
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
       // System.out.println("The sum of the array is: " + sum);
    }
}
