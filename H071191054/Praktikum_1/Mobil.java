import java.util.Scanner;

class Mobil {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        double efisiensi = 14;
        int waktu = sl.nextInt();
        int kecepatan = sl.nextInt();

        double hasil = ((waktu * kecepatan) / efisiensi);
        System.out.printf("Bensin yang dibutuhkan adalah %.3f", hasil);

    }
}