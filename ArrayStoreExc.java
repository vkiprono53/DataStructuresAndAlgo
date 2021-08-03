public class ArrayStoreExc{

    public static void main(String[] args){

        System.out.println("Testing ArrayStoreException");
        String[]names = new String[-10];
        int[]nums1 = new int[200];
        int[]nums2 = new int[20];
        nums1 = nums2;
        names[1] = "Famche";
        names[2] = "Vivaldi";
       // names[3] = 4;


    }
}