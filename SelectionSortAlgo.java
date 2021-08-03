import java.util.Arrays;

public class SelectionSortAlgo {
    public static int[] selectionSort(int[] list) {
        System.out.println("-------Beginning of selection sort algorithm-----");
        // Traversing the unsorted array
        for (int i = 0; i < list.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }
            }
            //Swapping
            int temp = list[min];
            list[min] = list[i];
            list[i] = temp;
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = {9, 6, 5, 4, 8, 9, 2, 40};
        System.out.println("-----Selection Sort Algorithm----");
        System.out.println(Arrays.toString(selectionSort(nums)));
        ;
        System.out.println("-----End of execution of selection sort algo----");
    }
}
