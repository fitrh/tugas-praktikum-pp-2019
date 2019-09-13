import java.util.Scanner;
class TugasPraktikum2{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Input detik --> ");
        int a = sc.nextInt();
        int jam = a / 3600;
        int menit = (a % 3600) / 60;
        int detik = a % 60;
        System.out.printf("%02d : %02d : %02d", jam, menit, detik);
    }
}