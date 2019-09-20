import java.util.Scanner;
/**
 * Tugas04
 */
public class Tugas04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double height = input.nextDouble();
        double weight = input.nextDouble();
        double percentage = input.nextInt();
        double calculate = (percentage/100)*(height-100);

        double ideal = height - 100 - calculate;
        double target = ideal - weight;

        System.out.println("Informasi");
        System.out.println("Nama : "+name);
        System.out.println("Tinggi Badan Anda : "+height);
        System.out.println("Berat Badan Anda : "+weight+" kg");
        System.out.println("Berat Badan Ideal Anda : "+ideal+" kg");
        System.out.printf("Target Berat Badan Ideal Anda : %.1f kg\n", target);

    }
}