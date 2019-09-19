import java.util.Scanner;
/**
 * Tugas05
 */
public class Tugas05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();

        boolean c = (a%b == 0 || b%a == 0);
        System.out.println("Apakah "+a+" Adalah kelipatan dari "+b+" ? : "+c);
        input.close();
    }
}