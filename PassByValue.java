public class PassByValue {
    private static int num = 10;
    public static void main(String[] args) {
        System.out.println("Base ::" + Integer.parseInt("10",2));
        int x = 10;
        increment(x);
        System.out.println("The x here is : " + x);

    }

    public static void increment(int x) {
        System.out.println("The num is " + num);
        x++;
        System.out.println("The value of x inside increment is : " + x);
    }
}
