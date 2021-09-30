public class Factorial {
    public static void main(String[] args) {
        Factorial factorial = new Factorial();
        int num = 12;
        System.out.println("-----TESTING RECURSION-----");
        System.out.println(factorial.findFactorial(num));
        System.out.println("-----END TESTING RECURSION----");
        System.out.println("*******************************");
        System.out.println("-----TESTING WITH LOOPS");
        System.out.println(factorial.findFactorialLoop(num));
        System.out.println("-----END TESTING WITH LOOPS-----");

    }

    /*
     *** Using recursion
     */
    public int findFactorial(int num) {
        System.out.println("-----Beginning of findFactorial()--");
        if (num == 0) {
            return 1;
        }
        System.out.println("-----End of findFactorial()---");
        return num * (findFactorial(num - 1));

    }

    /*
     *** Using Loops
     */
    public int findFactorialLoop(int num) {
        System.out.println("-----BEGINNING OF findFactorialLoop()-----");
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is====" + fact);
        return fact;
    }
}
