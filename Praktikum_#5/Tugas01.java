import java.util.Scanner;
/**
 * Tugas01
 */
public class Tugas01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("FPB dari "+a+" dan "+b+" = "+cariFPB(a, b));
        input.close();
    }

    public static int cariFPB(int a, int b) {
        if (b == 0) return a;
        return cariFPB(b, a%b);
    }
}