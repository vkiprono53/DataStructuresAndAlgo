import java.util.*;
import java.util.zip.Deflater;

/**
 * @author vkiprono
 * This is a class designed to print hello world and testing of Java SE
 */
public class Helo {
    /**
     * R-1.3 Write a short Java method, isMultiple, that takes two long values, n and m, and
     * returns true if and only if n is a multiple of m, that is, n = mi for some integer i.
     *
     * @return
     */
    public static boolean isMultiple(Long first, Long second) {
        System.out.println("-------checking divisors-----");
        if (first % second == 0) {
            return true;
        } else return false;
    }

    /**
     * R-1.4 Write a short Java method, isEven, that takes an int i and returns true if and only
     * * if i is even. Your method cannot use the multiplication, modulus, or division
     * operators, however.
     */
    public static boolean isEven(int num) {
        System.out.println("------checking if even------");
        System.out.println("**********==== " + (num & 1));
        if ((num & 1) == 0) {
            return true;
        } else
            return false;

    }

    /**
     * R-1.7 Write a short Java method that takes an integer n and returns the sum of the
     * * squares of all positive integers less than or equal to n.
     */
    public static int sumSquarePositiveInt(int num) {
        System.out.println("-----BEGINNING--------");

        int sum = 0;
        int square = 0;
        while (num > 0) {
            square = num * num;
            sum += square;
            num--;
        }
        return sum;
    }

    /**
     * R-1.8 Write a short Java method that counts the number of vowels in a given character
     * string.
     */

    public static int countVowels(String input) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'a' || input.charAt(i) == 'e' || input.charAt(i) == 'i' || input.charAt(i) == 'o' || input.charAt(i) == 'u') {
                count++;
            }

        }
        return count;
    }

    public static int sumEven(int num) {
        int sum = 0;
        while (num > 0) {
            if (num % 2 == 1) {
                sum += num;
            }
            num--;
        }
        return sum;

    }

    public static void inputAllBaseTypes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the base Type: ");
        String baseType = scanner.next();
        System.out.println("The base Type entered is : " + baseType);

    }

    public static double sum(double[] numbers) {
        System.out.println("-----summing the numbers-----");
        double total = 0;
//        //WHILE LOOP HERE----------
//        while (i < numbers.length) {
//            total += numbers[i];
//            System.out.println("======the sum here is===" + total);
//            i++;
//        }
//        FOR LOOP HERE--------
        for (double num : numbers) {
            System.out.println("--------number here is : " + num);
            total += num;
            System.out.println("****TOTAL HERE IS*******: " + total);

        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("****8888***");
        System.out.println("The number of the vowels in the string is : " + countVowels("Hello"));
        System.out.println("-----The sum of all positive numbers are: ---- " + sumSquarePositiveInt(4));
        //    System.out.println("The sum is : " + sumEven(10));
//            Scanner scanner = new Scanner(System.in);
//            //  System.out.println(isEven(6));
//            Long systemStart = System.nanoTime();
//            System.out.println("Start time is: " + systemStart);
//            System.out.println("---------> " + isEven1(8));
//            Long systemStop = System.nanoTime();
//            System.out.println("Stop time is: " + systemStop);
//            System.out.println("Time difference is : " + (systemStop - systemStart));


    }
}
