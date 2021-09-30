public class SunnyNum {
    public static void main(String[] args) {
        System.out.println("-----TEST MAIN-----");
        SunnyNum sunnyNum = new SunnyNum();
        int num = 81;
        System.out.println("Is "+ num + " a sunny number? " + sunnyNum.checkSunny(num));
    }
    public boolean checkSunny(int num){
        System.out.println("-----BEGINNING OF checkSunny()-----");
        int temp = num + 1;
        double sqrt = Math.sqrt(temp);
        System.out.println("Square root is: " + sqrt);
        System.out.println("Math.ceil is:::: + " + Math.ceil(sqrt));
        //Math.floor()
        if ((sqrt - Math.floor(sqrt)) == 0){
            return true;
        }
        else return false;
    }
}
