import java.util.Scanner;

class Derajat {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        while (sl.hasNextFloat()) {
            float degree = sl.nextFloat();
            int n = (int) ((degree / 360) * 24 * 3600);
            int hours = 6 + (n / 3600);
            hours -= hours > 24 ? 24 : 0;
            int minutes = (n % 3600) / 60;
            int second = (n % 3600) % 60;

            if (hours >= 18) {
                System.out.println("Selamat malam!");
            } else if (hours >= 15) {
                System.out.println("Selamat sore!");
            } else if (hours >= 12) {
                System.out.println("Selamat siang!");
            } else {
                System.out.println("Selamat pagi!");
            }

            System.out.printf("%02d:%02d:%02d%n", hours, minutes, second);
        }

    }
}