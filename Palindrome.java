public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";
        int input1 = 454;
        System.out.println(checkPalindrome(input1));


    }

    public static boolean checkPalindrome(int input1) {
        System.out.println("------Beginning of checkPalindrome()---");
         String output = "";
         String input = String.valueOf(input1);
       // StringBuilder output = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            output += input.charAt(i);
          //  output.append(input.charAt(i));
        }
        System.out.println("The output is: " + output);
        if (output.equals(input)) {
            return true;
        }

        return false;

        //  System.out.println("------End of checkPalindrome()---");
    }
}
