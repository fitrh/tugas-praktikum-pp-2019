import java.util.Scanner;
import java.lang.Math;
/**
 * Tugas03
 */
public class Tugas03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double h = input.nextDouble();
        double a = input.nextDouble();
        double b = input.nextDouble();

        a = Math.toRadians(a);
        b = Math.toRadians(b);

        double y = (Math.tan(b))*h;
        double x = ((Math.tan(a))*h) - y;

        System.out.printf("Panjang Kapal : %f M", x);
    }
}