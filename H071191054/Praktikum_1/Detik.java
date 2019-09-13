import java.util.Scanner;

class Detik {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.println("Input total detik");
        int x = sl.nextInt();

        int jam, menit, detik;
        jam = x / 3600;
        menit = (x % 3600) / 60;
        detik = (x % 3600) % 60;

        System.out.printf("%02d : %02d : %02d", jam, menit, detik);

    }
}