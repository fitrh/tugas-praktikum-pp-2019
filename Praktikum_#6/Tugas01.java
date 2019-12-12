import java.util.Scanner;
/**
 * Tugas01
 */
public class Tugas01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        input.close();
        String noSpace = word.replaceAll("\\s+", "");
        String upper = noSpace.toUpperCase();
        int partWords = upper.length()/2;
        System.out.println(upper.substring(0, partWords));
    }
}