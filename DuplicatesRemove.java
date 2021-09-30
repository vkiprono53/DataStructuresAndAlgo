import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class DuplicatesRemove {

    public static void main(String[] args) {
        System.out.println("----Beginning of the test method---");
        int[] withDuplicates = new int[]{45, 6, 4, 4};
        int length = removeDuplicates(withDuplicates);
        for(int i=0;i<length;i++) {
            System.out.print(withDuplicates[i] + " ");
        }
    }

    public static int removeDuplicates(int[] nums) {
        System.out.println("-----Beginning of removeDuplicates()---");

        int[] newArray = new int[nums.length];
        int j = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if ((nums[i] != nums[i + 1])) {
                nums[j++] = nums[i];
            }
        }
        newArray[j++] = nums[nums.length - 1];

        for (int k = 0; k < j; k++) {
            nums[k] = newArray[k];
        }
        return j;

    }
}
