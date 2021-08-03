public class Factorial {
    public static void main(String[] args) {
        System.out.println("-----Beginning of factorial()----");

        System.out.println(factorial(10));
    }

    public static long factorial(int num) {
        long fact;
        if (num < 2) {
            return 1L;
        } else {
            fact = (num * factorial(num - 1));
        }
        return fact;
    }
}
