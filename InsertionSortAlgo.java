import java.util.Arrays;

public class InsertionSortAlgo {
    public static int[] selectionSort(int[] list) {
        System.out.println("----Beginning of the selection sort----");
        //Loop through the list
        for (int i = 0; i < list.length - 1; i++) {
            //shifting
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[i]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println("----Insertion Sort Algorithm----");
        int[] list = {56, 5, 99, 4, 6, 7, 2};
        System.out.println(Arrays.toString(selectionSort(list)));

    }
}
