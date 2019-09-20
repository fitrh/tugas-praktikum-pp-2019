import java.util.Scanner;
/**
 * Tugas01
 */
public class Tugas01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jam = input.nextInt();
        int rata2 = input.nextInt();
        double jarak = jam*rata2;
        double bensin = jarak/14;
        System.out.printf("Bensin Yang Digunakan : %.3fL\n", bensin);
    }
}