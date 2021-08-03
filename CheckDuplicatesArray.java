import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CheckDuplicatesArray {
    public static void main(String[] args) {

        Integer[] withDuplicates = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 10};

        Integer[] withoutDuplicates = new Integer[]{4, 5, 9, 6, 8, 7};
        System.out.println("The one with Duplicates " + checkDuplicates(withDuplicates));

        System.out.println("Without duplicates: " + checkDuplicates(withoutDuplicates));
    }


    public static boolean checkDuplicates(Integer[] nums) {
        List<Integer> numList = Arrays.asList(nums);
        Set<Integer> numSet = new HashSet<Integer>(Arrays.asList(nums));
        System.out.println("The size of list is: " + nums.length);
        System.out.println("The size of numList is: " + numList.size());
        System.out.println("The size of set is: " + numSet.size());

        if (numSet.size() < numList.size()) {
            return true;
        }
        return false;
    }
}
