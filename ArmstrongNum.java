public class ArmstrongNum {
    public static void main(String[] args) {
        ArmstrongNum armstrongNum = new ArmstrongNum();
        System.out.println("-----TESTING ARMSTRONG NUMBER------");
        System.out.println(armstrongNum.checkArmstrong(153));
        System.out.println("-----END TESTING ARMSTRONG NUMBER------");
    }

    public boolean checkArmstrong(int num) {
        System.out.println("-----BEGINNING OF checkArmstrong()-----");
        String input = String.valueOf(num);
        int len = input.length();
        System.out.println("---The Length of the string is:----" + len);
        int result = 0;
        for (int i = 0; i < len; i++) {
            System.out.println("Result is: " + result);
            char valueI = input.charAt(i);
            int intChar = Character.getNumericValue(valueI);
            System.out.println("-----INT VALUE OF THE CHARACTER IS----" + intChar);
            System.out.println("---" + (Math.pow(intChar, len)));
           result += Math.pow(intChar, len);
            System.out.println("Result is: " + result);
        }
        System.out.println("The result is: " + result);

        return result == num;
    }
}
