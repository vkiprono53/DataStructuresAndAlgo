public class FascinatinNum {
    public static void main(String[] args) {
        System.out.println(":::::BEGINNING TO TEST:::::");
        FascinatinNum fascinatinNum = new FascinatinNum();
        System.out.println(fascinatinNum.checkFascinating(192));
    }

    public boolean checkFascinating(int num) {
        System.out.println("::::BEGINNING OF checkFascinating()::::");
        String inputNum = String.valueOf(num);
        if (inputNum.length() < 3) {
            return false;
        }
        int doubleNum = num * 2;
        int tripleNum = num * 3;

        String output = num + "" + doubleNum + tripleNum;
        System.out.println("Output is: " + output);

        //Loop from 1 to 9
        for (char c = '1'; c <= '9'; c++) {
            System.out.println("CHAR C HERE IS::::"+ c);
            int count = 0;

            for (int i = 0; i < output.length(); i++) {
                System.out.println("char at i is::" + output.charAt(i));
                if (c == output.charAt(i)) {
                    count++;
                    break;
                }
            }

            if (count == 0 || count > 1) {
                return false;
            }
        }
        return true;

    }
}
