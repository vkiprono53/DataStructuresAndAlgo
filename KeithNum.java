public class KeithNum {
    public static void main(String[] args) {
        System.out.println(":::::TESTING KEITH:::::");
        KeithNum keithNum = new KeithNum();
        int num = 742;
        System.out.println(keithNum.checkKeith(num));
        System.out.println();

    }

    public boolean checkKeith(int num){
        //Separate the digits and find the sum
        System.out.println(":::::Beginning of checkKeith():::::");
        int lastDigit =  0;
        int sum = 0;
        while (num > 0){
            lastDigit = num % 10;
            System.out.println("Last Digit here is:::" + lastDigit);
            sum += lastDigit;
            num /= 10;
        }

        return true;
    }
}
