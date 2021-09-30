public class TechNumber {
    public static void main(String[] args) {
        System.out.println(":::::BEGINNING OF TESTING::::::");
        TechNumber techNumber = new TechNumber();
        int num = 1322;
        System.out.println("Is " + num + " a TechNumber?===" +techNumber.checkTechNum(num) );
        System.out.println(":::::END OF TESTING:::::");

    }
    public boolean checkTechNum(int num){
        System.out.println("-----Beginninc of checkTechNum()-----");
        String numberStr = String.valueOf(num);
        int len = numberStr.length();
        System.out.println("---The Length of the number is---" + len);
        if (len%2 !=0){
            return false;
        }
        int first = Integer.parseInt(numberStr.substring(0,len/2));
        int second = Integer.parseInt(numberStr.substring(len/2));
        int sum = first + second;
        System.out.println("Sum of the two numbers is: " + sum);
        int square = sum * sum;
        System.out.println("The square of the sum is: " + square);

        return (square == num);
    }
}
