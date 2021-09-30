public class FibonacciJava {
    public static void main(String[] args) {
        System.out.println("---");
        //System.out.println("The fibonacci of 2: " + fibonacci(2));
        System.out.println(getFib(10));
        System.out.println("");
    }

    /*
     *** Using Recursion
     */
    public static int fibonacci(int num) {
        // System.out.println("-----Beginning of fibonacci()---");
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            int result = (fibonacci(num - 1) + fibonacci(num - 2));
            return result;
        }
    }
    /*
     *** Without Recursion
     */

    public static int getFib(int num) {
        System.out.println("----Beginning of getFib()---");
        int first = 0;
        int sec = 1;
        int res = 0;
        for (int i = 2; i <= num; i++) {
            res = first + sec;
            System.out.print("--" + res);
            first = sec;
            sec = res;
        }
        System.out.println();
        System.out.print("-----ENDING------");
        return res;
    }
}
