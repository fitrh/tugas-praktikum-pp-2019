import java.util.Scanner;

class Luasvolume {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);

        System.out.println("**MENU**");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Volume Bangun Ruang");
        System.out.println("Input angka sesuai dengan menu yang diinginkan");

        int n = sl.nextInt();

        switch (n) {
        case 1:
            System.out.println("**Pilih Bangun Datar**");
            System.out.println("1. Persegi");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Segitiga");
            System.out.println("4. Lingkaran");
            System.out.println("5. Jajar Genjang");
            System.out.println("6. Trapesium");
            System.out.println("7. Belah Ketupat");
            System.out.println("8. Layang-layang");
            System.out.println(" ");
            System.out.println("Input angka sesuai dengan nomor bangun datar yang diinginkan");

            int menu = sl.nextInt();

            switch (menu) {
            case 1:
                System.out.println("Input sisi");
                double aa = sl.nextDouble();
                System.out.println("Luas persegi adalah " + Math.pow(aa, 2));
                break;

            case 2:
                System.out.println("Input panjang");
                double bb = sl.nextDouble();
                System.out.println("Input lebar");
                double cc = sl.nextDouble();
                System.out.println("Luas persegi panjang adalah " + bb * cc);
                break;

            case 3:
                System.out.println("Input alas");
                double dd = sl.nextDouble();
                System.out.println("Input tinggi");
                double ee = sl.nextDouble();
                System.out.println("Luas segitiga adalah " + (dd * ee) / 2);
                break;

            case 4:
                System.out.println("Input jari-jari");
                double ff = sl.nextDouble();
                System.out.println("Luas lingkaran adalah " + 3.14 * Math.pow(ff, 2));
                break;

            case 5:
                System.out.println("Input alas");
                double gg = sl.nextDouble();
                System.out.println("Input tinggi");
                double hh = sl.nextDouble();
                System.out.println("Luas jajar genjang adalah " + (gg * hh));
                break;

            case 6:
                System.out.println("Input sisi atas");
                double sa = sl.nextDouble();
                System.out.println("Input sisi bawah");
                double sb = sl.nextDouble();
                System.out.println("Input tinggi");
                double ii = sl.nextDouble();
                System.out.println("Luas trapesium adalah " + ((sa + sb) * ii) / 2);
                break;

            case 7:
                System.out.println("Input diameter 1");
                double d1 = sl.nextDouble();
                System.out.println("Input diameter 2");
                double d2 = sl.nextDouble();
                System.out.println("Luas belah ketupat adalah " + (d1 * d2) / 2);
                break;

            case 8:
                System.out.println("Input diameter 1");
                double d3 = sl.nextDouble();
                System.out.println("Input diameter 2");
                double d4 = sl.nextDouble();
                System.out.println("Luas layang-layang adalah " + (d3 * d4) / 2);
                break;
            }
            break;

        case 2:
            System.out.println("**Pilih Bangun Ruang**");
            System.out.println("1. Kubus");
            System.out.println("2. Balok");
            System.out.println("3. Tabung");
            System.out.println("4. Prisma segitiga");
            System.out.println("5. Limas segitiga");
            System.out.println("6. Limas segiempat");
            System.out.println("7. Kerucut");
            System.out.println("8. Bola");
            System.out.println(" ");
            System.out.println("Input angka sesuai dengan nomor bangun ruang yang diinginkan");

            int menu2 = sl.nextInt();

            switch (menu2) {
            case 1:
                System.out.println("Input sisi");
                double jj = sl.nextDouble();
                System.out.println("Volume kubus adalah " + Math.pow(jj, 3));
                break;

            case 2:
                System.out.println("Input panjang");
                double kk = sl.nextDouble();
                System.out.println("Input lebar");
                double ll = sl.nextDouble();
                System.out.println("Input tinggi");
                double mm = sl.nextDouble();
                System.out.println("Volume balok adalah " + kk * ll * mm);
                break;

            case 3:
                System.out.println("Input jari-jari");
                double nn = sl.nextDouble();
                System.out.println("Input tinggi");
                double oo = sl.nextDouble();
                System.out.println("Volume tabung adalah " + 3.14 * Math.pow(nn, 2) * oo);
                break;

            case 4:
                System.out.println("Input sisi 1");
                double s1 = sl.nextDouble();
                System.out.println("Input sisi 2");
                double s2 = sl.nextDouble();
                System.out.println("Input tinggi");
                double pp = sl.nextDouble();
                System.out.println("Volume prisma segitiga adalah " + (s1 * s2 * pp) / 2);
                break;

            case 5:
                System.out.println("Input luas alas");
                double qq = sl.nextDouble();
                System.out.println("Input tinggi");
                double rr = sl.nextDouble();
                System.out.println("Volume limas segitiga adalah " + qq * rr);
                break;

            case 6:
                System.out.println("Input luas alas");
                double ss = sl.nextDouble();
                System.out.println("Input tinggi");
                double ti = sl.nextDouble();
                System.out.println("Volume limas segiempat adalah " + (ss * ti) / 3);
                break;

            case 7:
                System.out.println("Input jari-jari");
                double jr = sl.nextDouble();
                System.out.println("Input tinggi");
                double tg = sl.nextDouble();
                System.out.println("Volume kerucut adalah " + (3.14 * Math.pow(jr, 2) * tg) / 3);
                break;

            case 8:
                System.out.println("Input jari-jari");
                double jar = sl.nextDouble();
                System.out.println("Volume bola adalah " + (4 * 3.14 * Math.pow(jar, 3) / 3));
                break;

            }
            break;

        }
    }
}