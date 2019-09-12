import java.util.Scanner;
class Praktikum5{
    public static void main(String[] args) {
        Scanner Praktikum5 = new Scanner(System.in);

        System.out.println("jumlah satuan detik = ");
        int detik = Praktikum5.nextInt();
        int jam = detik/3600;
        int detik1 = detik - (jam*3600);
        int menit = detik1/60;
        int detik2 = menit * 60;
        int detik3 = detik1 - detik2;
        System.out.printf(jam + ":" + menit + ":" +detik3);
    }
}