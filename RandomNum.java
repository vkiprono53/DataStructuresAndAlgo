import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        System.out.println("-----TESTING RANDOM----");
        RandomNum randomNum = new RandomNum();
        System.out.println("Random Number is: " + randomNum.getRandomNum(5));
        System.out.println("-------END-----");
    }
    public int getRandomNum(int range){
        System.out.println("------Beginning----");
        Random random = new Random();
        int rand = random.nextInt(range);
        int ran = (int)(Math.random() * 10);
        System.out.println("Ran is: " + ran);
        return rand;
    }
}
