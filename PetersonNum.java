public class PetersonNum {
    public static void main(String[] args) {
        System.out.println("-----TEST BEGINNING-----");
        PetersonNum petersonNum = new PetersonNum();
        int num = 145;
        System.out.println("Checking peterson number+ " + petersonNum.checkPeterson(num));
        System.out.println("-----TEST END-----");
    }
    public boolean checkPeterson(int num){
        System.out.println("-----Beginning of checkPeterson()-----");
        int sum = 0;
        int num1 = num;
        int lastDigit = 0;
        while (num1 > 0){
            lastDigit = num1 % 10;
            sum += calculateFactorial(lastDigit);
            System.out.println("---LAST DIGIT HER==" + lastDigit + "---AND SUM IS----" + sum);
            num1 /= 10;

            if (sum == num){
                return true;
            }
        }
        return false;
    }
    public int calculateFactorial(int num){
       // System.out.println("----BEGINNING OF calculateFactorial()----");
        int factorial = 0;
      //  System.out.println("NUMBER TO CALCULATE FACTORIAL IS:::" + num);
        if (num == 1 || num == 0){
            return 1;
        }
        else {
            factorial = num * calculateFactorial(num-1);
        }
    //    System.out.println("FACTORIAL OF NUM IS::;" + factorial);
        return factorial;
    }
}
