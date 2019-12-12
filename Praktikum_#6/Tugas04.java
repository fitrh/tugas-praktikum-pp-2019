import java.util.Scanner;
/**
 * Tugas04
 */
public class Tugas04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] part = new String[]{str.substring(0, (str.length()/2)-1), str.substring(str.length()/2, str.length()-1)};
    }
}