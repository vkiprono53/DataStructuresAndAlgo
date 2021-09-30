import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("******BEGINNING OF TEST********");
        ReverseNumber reverseNumber = new ReverseNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("-----Enter the number to reverse----");
        int input = scanner.nextInt();
        System.out.println("The revese222 number of + " + input + " is : " + reverseNumber.reverseNum(input));
    }

    public int reverseNum(int num){
        System.out.println("-----Beginning of reverseNUm()-----" );
        int inputNum = num;
        System.out.println("-------NUMBER HERE IS---** "+ inputNum);
        System.out.println("Math.pow 2,-31--" + Math.pow(2, -31) );
        System.out.println("Math.pow 2,31--" + Math.pow(2, 31) );

        if (inputNum < 0){
            inputNum = inputNum * -1;
        }
        System.out.println("The number is " + inputNum);
        long outputNum = 0;
        String input = String.valueOf(inputNum);
        int len = input.length();
        String output = "";

        for (int i = len-1;i>=0;i--){
            output += input.charAt(i);
        }
        System.out.println("---The output here is---" + output);
        //outputNum = Integer.parseInt(output);
        outputNum = Long.parseLong(output);

        if (outputNum < Integer.MIN_VALUE || outputNum > Integer.MAX_VALUE){
            return 0;
        }
        if (num < 0){
            return (int)(outputNum * -1);
        }
        else{
            return (int)outputNum;
        }

    }

    public int reverseNum2(int num){
        int output = 0;
        int rem = 0;

        while (num >0){
            rem = num % 10;
            output = (output * 10) + rem;
            num /= 10;
        }
        if (output <= Integer.MIN_VALUE || output > Integer.MAX_VALUE){
            return 0;
        }
        return output;
    }
}
