import java.util.Scanner;
/**
 * Tugas04
 */
public class Tugas04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int menu;
        double panjang,lebar,tinggi,alas,jari2, luas, volume;
        try {
            System.out.println("** Menu **");
            System.out.println("1. Mencari Luas Bangun Datar");
            System.out.println("2. Mencari Volume Bangun Ruang \n");
            System.out.println("Input Angka sesuai dengan Menu yg diinginkan :");
            menu = input.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("** Pilih Bangun Datar **");
                    System.out.println("1. Persegi");
                    System.out.println("2. Persegi Panjang");
                    System.out.println("3. Segitiga");
                    System.out.println("4. Lingkaran");
                    System.out.println("5. Jajar Genjang");
                    System.out.println("6. Trapesium");
                    System.out.println("7. Belah Ketupat");
                    System.out.println("8. Layang-Layang \n");
                    System.out.println("Input Angka sesuai dengan nomot bangun datar yg diinginkan :");
                    menu = input.nextInt();
                    switch(menu) {
                        case 1:
                            System.out.println("Input Panjang");
                            panjang = input.nextDouble();
                            luas = Math.pow(panjang, 2);
                            System.out.printf("Luas Persegi = %.1f\n", luas);
                            break;
                        case 2:
                            System.out.println("Input Panjang");
                            panjang = input.nextDouble();
                            System.out.println("Input Lebar");
                            lebar = input.nextDouble();
                            luas = panjang*lebar;
                            System.out.printf("Luas Persegi Panjang = %.1f\n", luas);
                            break;
                        case 3:
                            System.out.println("Input Alas");
                            alas = input.nextDouble();
                            System.out.println("Input Tinggi");
                            tinggi = input.nextDouble();
                            luas = 0.5*alas*tinggi;
                            System.out.printf("Luas Segitiga = %.1f\n", luas);
                            break;
                        case 4:
                            System.out.println("Input Jari-Jari");
                            jari2 = input.nextDouble();
                            luas = Math.PI*Math.pow(jari2, 2);
                            System.out.printf("Luas Lingkaran = %.1f\n", luas);
                            break;
                        case 5:
                            System.out.println("Input Alas");
                            alas = input.nextDouble();
                            System.out.println("Input Tinggi");
                            tinggi = input.nextDouble();
                            luas = alas*tinggi;
                            System.out.printf("Luas Jajar Genjang = %.1f\n", luas);
                            break;
                        case 6:
                            System.out.println("Input Alas");
                            alas = input.nextDouble();
                            System.out.println("Input Panjang");
                            panjang = input.nextDouble();
                            System.out.println("Input Tinggi");
                            tinggi = input.nextDouble();
                            luas = 0.5*(alas+panjang)*tinggi;
                            System.out.printf("Luas Trapesium = %.1f\n", luas);
                            break;
                        case 7:
                            System.out.println("Input Diagonal 1");
                            tinggi = input.nextDouble();
                            System.out.println("Input Diagonal 2");
                            panjang = input.nextDouble();
                            luas = 0.5*panjang*tinggi;
                            System.out.printf("Luas Belah Ketupat = %.1f\n", luas);
                            break;
                        case 8:
                            System.out.println("Input Diagonal 1");
                            tinggi = input.nextDouble();
                            System.out.println("Input Diagonal 2");
                            panjang = input.nextDouble();
                            luas = 0.5*panjang*tinggi;
                            System.out.printf("Luas Layang-Layang = %.1f\n", luas);
                            break;
                        default:
                            System.out.println("Masukkan Inputan sesuai nomor.");
                            break;
                    }
                    break;
                
                case 2:
                    System.out.println("** Pilih Bangun Ruang **");
                    System.out.println("1. Kubus");
                    System.out.println("2. Balok");
                    System.out.println("3. Limas");
                    System.out.println("4. Prisma Segitiga");
                    System.out.println("5. Kerucut");
                    System.out.println("6. Tabung");
                    System.out.println("7. Bola \n");
                    System.out.println("Input Angka sesuai dengan nomor bangun ruang yg diinginkan :");
                    menu = input.nextInt();
                    switch(menu) {
                        case 1:
                            System.out.println("Input Panjang");
                            panjang = input.nextDouble();
                            volume = Math.pow(panjang, 3);
                            System.out.printf("Volume Kubus = %.1f\n", volume);
                            break;
                        case 2:
                            System.out.println("Input Panjang");
                            panjang = input.nextDouble();
                            System.out.println("Input Lebar");
                            lebar = input.nextDouble();
                            System.out.println("Input Tinggi");
                            tinggi = input.nextDouble();
                            volume = panjang*lebar*tinggi;
                            System.out.printf("Volume Balok = %.1f\n", volume);
                            break;
                        case 3:
                            System.out.println("Input Panjang");
                            panjang = input.nextDouble();
                            System.out.println("Input Lebar");
                            lebar = input.nextDouble();
                            System.out.println("Input Tinggi");
                            tinggi = input.nextDouble();
                            volume = (1.0/3.0)*(panjang*lebar)*tinggi;
                            System.out.printf("Volume Limas = %.1f\n", volume);
                            break;
                        case 4:
                            System.out.println("Input Alas");
                            alas = input.nextDouble();
                            System.out.println("Input Tinggi Alas");
                            lebar = input.nextDouble();
                            System.out.println("Input Tinggi");
                            tinggi = input.nextDouble();
                            volume = (0.5*alas*lebar)*tinggi;
                            System.out.printf("Volume Prisma Segitiga = %.1f\n", volume);
                            break;
                        case 5:
                            System.out.println("Input Jari-Jari");
                            jari2 = input.nextDouble();
                            System.out.println("Input Tinggi");
                            tinggi = input.nextDouble();
                            volume = (1.0/3.0)*(Math.PI*Math.pow(jari2, 2))*tinggi;
                            System.out.printf("Volume Kerucut = %.1f\n", volume);
                            break;
                        case 6:
                            System.out.println("Input Jari-Jari");
                            jari2 = input.nextDouble();
                            System.out.println("Input Tinggi");
                            tinggi = input.nextDouble();
                            volume = (Math.PI*Math.pow(jari2, 2))*tinggi;
                            System.out.printf("Volume Tabung = %.1f\n", volume);
                            break;
                        case 7:
                            System.out.println("Input Jari-Jari");
                            jari2 = input.nextDouble();
                            volume = (4.0/3.0)*Math.PI*Math.pow(jari2, 3);
                            System.out.printf("Volume Tabung = %.1f\n", volume);
                            break;
                        default:
                            System.out.println("Masukkan Inputan sesuai nomor.");
                            break;
                    }
                    break;
            
                default:
                    System.out.println("Masukkan Inputan sesuai nomor.");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
        input.close();
    }
}