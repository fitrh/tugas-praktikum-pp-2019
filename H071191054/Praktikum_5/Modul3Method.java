import java.util.Scanner;

class Modul3Method {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int umur = sl.nextInt();

        if (umur < 365) {
            System.out.println("Umur anda belum sampai 1 tahun");
        } else {
            myday(umur);
        }
    }

    public static void myday(int umur) {
        int year, month, day;
        year = umur / 365;
        umur %= 365;
        month = umur / 30;
        day = umur % 30;

        System.out.println(year + "tahun");
        System.out.println(month + "bulan");
        System.out.println(day + "hari");
    }
}