public class PrimeNum {
    public static void main(String[] args) {
        System.out.println("---TESTING----");
        System.out.println(checkPrime(9));
        System.out.println("-----");
    }
    public static boolean checkPrime(int num){
        System.out.println("----BEGINNING----");
        for (int i=2; i<num-1; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
