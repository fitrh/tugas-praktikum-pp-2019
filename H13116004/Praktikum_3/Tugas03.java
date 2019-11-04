import java.util.Scanner;
/**
 * Tugas03
 */
public class Tugas03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 0;
        int b = 1;
        int c = 1;
        int max = in.nextInt();
        in.close();
        System.out.print(a+" ");
        for (int i = 1; i < max; i++) {
            System.out.print(c+" ");
            c = b + a;
            a = b;
            b = c;
        }
        in.close();
    }
}