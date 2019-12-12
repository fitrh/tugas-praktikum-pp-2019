import java.util.Scanner;
/**
 * Tugas03
 */
public class Tugas03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numWords = input.nextInt();
        int palindrome = 0;
        boolean isPalindrome = true;
        String[] str = new String[numWords];
        for (int i = 0; i < numWords; i++) {
            str[i] = input.nextLine();
        }

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length(); j++) {
                if(str[i].charAt(j) != str[i].charAt(str[i].length() - 1 - j)) {
                    isPalindrome = false;
                } else {
                    isPalindrome = true;
                }
            }
            if (isPalindrome = true) {
                palindrome += i;
            }
        }
        System.out.println(palindrome);
        input.close();

    }
}