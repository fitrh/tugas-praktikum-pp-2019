import java.util.Scanner;

class Lingkaran {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("Input dua titik");
        int x = sl.nextInt();
        int y = sl.nextInt();
        double z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        if (z <= 25) {
            System.out.println("Berada di dalam lingkaran A";
        } else if (z <= 144) {
            System.out.println("Berada di dalam lingkaran B");
        } else if (z <= 400) {
            System.out.println("Berada di dalam lingkaran C");
        }
    }
}