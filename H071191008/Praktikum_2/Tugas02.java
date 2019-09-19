import java.util.Scanner;
public class Tugas01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int pilih1;
        System.out.println("** Menu **");
        System.out.println("1. Mencari Luas Bangun Datar");
        System.out.println("2. Mencari Keliling Bangun Datar");
        System.out.print("\n Input angka sesuai dengan Menu yang diinginkan = ");
        pilih1 = input.nextInt();

        switch (pilih1){
          case 1:
              System.out.println("** Pilih Bangun Datar **");
              System.out.println("1. Persegi");
              System.out.println("2. Persegi Panjang");
              System.out.println("3. Segitiga");
              System.out.println("4. Lingkaran");
              System.out.println("5. Jajar Genjang");
              System.out.println("6. Trapesium");
              System.out.println("7. Belah Ketupat");
              System.out.println("8. Layang - Layang");
              System.out.print("Input angka sesuai dengan nomor Bangun Ruang yang diinginkan = ");

              int pilih2;
              pilih2 = input.nextInt();

          switch (pilih2){
            case 1:
                System.out.println("=== Persegi ===");
                double lp;
                double s;
                System.out.print("Sisi = ");
                s = input.nextDouble();
                lp = s*s;
                System.out.print("Luas = "+lp);
            break;

            case 2:
                double luasPP;
                double ppp;
                double le;
                System.out.println("=== Persegi Panjang ===");
                System.out.print("Panjang = ");
                ppp = input.nextDouble();
                System.out.print("Lebar = ");
                le = input.nextDouble();
                luasPP = ppp * le;
                System.out.print("Luas = "+luasPP);
            break;

                case 3:
                System.out.println("=== Segitiga ===");
                double ls;
                double as;
                double ts;
                System.out.print("Alas = ");
                as = input.nextDouble();
                System.out.print("Tinggi = ");
                ts = input.nextDouble();
                ls = as*ts/2;
                System.out.println("Luas = "+ls);
            break;

            case 4:
                System.out.println("=== Lingkaran ===");
                double ll;
                double rl;
                System.out.print("Radius = ");
                rl = input.nextDouble();
                ll = Math.PI*rl*rl;
                System.out.print("Luas = "+ll);
            break;

            case 5:
                System.out.println("=== Jajar Genjang ===");
                double ljg;
                double ajg;
                double tjg;
                System.out.print("Alas = ");
                ajg = input.nextDouble();
                System.out.print("Tinggi = ");
                tjg = input.nextDouble();
                ljg = ajg * tjg;
                System.out.print("Luas = "+ljg);
            break;

            case 6:
                System.out.println("=== Trapesium ===");
                double ltr;
                double atr;
                double btr;
                double ttr;
                System.out.print("Sisi Sejajar 1 = ");
                atr = input.nextDouble();
                System.out.print("Sisi Sejajar 2 = ");
                btr = input.nextDouble();
                System.out.print("Tinggi = ");
                ttr = input.nextDouble();
                ltr = 0.5 * ((atr + btr) * ttr);
                System.out.print("Luas = "+ltr);
            break;

            case 7:
                System.out.println("=== Belah Ketupat ===");
                double lbk;
                double d1bk;
                double d2bk;
                System.out.print("Diagonal 1 = ");
                d1bk = input.nextDouble();
                System.out.print("Diagonal 2 = ");
                d2bk = input.nextDouble();
                lbk = 0.5 * (d1bk * d2bk);
                System.out.print("Luas = "+lbk);
            break;

            case 8:
                System.out.println("=== Layang - Layang ===");
                double lll;
                double d1ll;
                double d2ll;
                System.out.print("Diagonal 1 = ");
                d1ll = input.nextDouble();
                System.out.print("Diagonal 2 = ");
                d2ll = input.nextDouble();
                lll = 0.5 * (d1ll * d2ll);
                System.out.print("Luas = "+lll);
            break;

          }
          break;

          case 2:
              System.out.println("** Pilih Bangun Datar **");
              System.out.println("1. Persegi");
              System.out.println("2. Persegi Panjang");
              System.out.println("3. Segitiga");
              System.out.println("4. Lingkaran");
              System.out.println("5. Jajar Genjang");
              System.out.println("6. Trapesium");
              System.out.println("7. Belah Ketupat");
              System.out.println("8. Layang - Layang");
              System.out.print("Input angka sesuai dengan nomor Bangun Ruang yang diinginkan = ");

              int pilih3 = input.nextInt();

          switch(pilih3){
            case 1:
                System.out.println("=== Persegi ===");
                double kp;
                double sp;
                System.out.print("Panjang = ");
                sp = input.nextDouble();
                kp = 4*sp;
                System.out.print("Keliling = "+kp);
            break;

            case 2:
                System.out.println("=== Persegi Panjang ===");
                double kpp;
                double klpp;
                double kppp;
                System.out.print("Panjang = ");
                kppp = input.nextDouble();
                System.out.print("Lebar = ");
                klpp = input.nextDouble();
                kpp = (2*kppp)+(2*klpp);
                System.out.print("Luas = "+kpp);
            break;

            case 3:
                System.out.println("=== Segitiga ===");
                double kss1;
                double kss2;
                double kss3;
                double ks;
                System.out.print("Sisi 1 = ");
                kss1 = input.nextDouble();
                System.out.print("Sisi 2 =");
                kss2 = input.nextDouble();
                System.out.print("Sisi 3 = ");
                kss3 = input.nextDouble();
                ks = kss1 + kss2 + kss3;
                System.out.println("Keliling = "+ks);
            break;

            case 4:
                System.out.println("=== Lingkaran ===");
                double krl;
                double kl;
                System.out.print("Ruas = ");
                krl = input.nextDouble();
                kl = Math.PI*2*krl;
                System.out.println("Keliling = "+kl);
            break;

            case 5:
                System.out.println("=== Jajar Genjang ===");
                double kjg;
                double kd1jg;
                double kd2jg;
                System.out.print("Diagonal 1 = ");
                kd1jg = input.nextDouble();
                System.out.print("Diagonal 2 =");
                kd2jg = input.nextDouble();
                kjg = 2 * (kd1jg + kd2jg);
                System.out.print("Keliling = "+kjg);
            break;

            case 6:
                System.out.println("=== Trapesium ===");
                double kt;
                double s1t;
                double s2t;
                double s3t;
                double s4t;
                System.out.print("Sisi 1 = ");
                s1t = input.nextDouble();
                System.out.print("Sisi 2 = ");
                s2t = input.nextDouble();
                System.out.print("Sisi 3 = ");
                s3t = input.nextDouble();
                System.out.print("Sisi 4 = ");
                s4t = input.nextDouble();
                kt = s1t + s2t + s3t + s4t;
                System.out.print("Keliling = "+kt);
            break;

            case 7:
                System.out.println("=== Belah Ketupat ===");
                double kbk;
                double sbk;
                System.out.print("Sisi = ");
                sbk = input.nextDouble();
                kbk = sbk * 4;
                System.out.print("Keliling = "+kbk);
            break;

            case 8:
                System.out.println("=== Layang - Layang ===");
                double kll;
                double all;
                double bll;
                System.out.print("Sisi a = ");
                all = input.nextDouble();
                System.out.println();
                bll = input.nextDouble();
                kll = 2 * (all + bll);
                System.out.println("Keliling = "+kll);
            break;
          }

        }
      }
}
