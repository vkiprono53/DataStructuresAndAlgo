public class AutomorphicNum {
    public static void main(String[] args) {
        System.out.println("-----TESTING-----");
        int num = 20;
        AutomorphicNum automorphicNum = new AutomorphicNum();
        System.out.println("Is " + num + " Automorphic? " + automorphicNum.checkAutomorph(num));
        System.out.println("-----END TESTING------");
    }

    public boolean checkAutomorph(int num) {
        System.out.println("-----Beginning of checkAutomorph()-----");
        int square = num * num;
        int remSquare = 0;
        int remNum = 0;

        while (num > 0){
            remNum = (num % 10) ;
            remSquare = (square % 10);
            System.out.println("remNum====" + remNum);
            System.out.println("remSquare====" + remSquare);
            if (remNum != remSquare)
                return false;
            num /= 10;
            square /= 10;
        }
        return true;
    }
}