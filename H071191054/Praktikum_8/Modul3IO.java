import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Modul3IO {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);

        FileWriter fw = null;
        PrintWriter pw = null;

        try {
            System.out.println("Input nama file: ");
            String dest = sl.nextLine();
            System.out.println("Input jumlah asisten yang ditambahkan: ");
            int data = sl.nextInt();
            sl.nextLine();
            String[] nama = new String[data];
            String[] nim = new String[data];
            String[] angkatan = new String[data];
            for (int i = 0; i < data; i++) {
                System.out.println("Input nama asisten : ");
                nama[i] = sl.nextLine();
                System.out.println("Input NIM asisten : ");
                nim[i] = sl.nextLine();
                System.out.println("Input angkatan asisten : ");
                angkatan[i] = sl.nextLine();
            }
            sl.close();
            fw = new FileWriter(dest + ".txt");
            pw = new PrintWriter(fw);

            pw.println("+--------------------+-----------+---------+");
            pw.println("|Nama                |NIM        |Angkatan |");
            pw.println("+--------------------+-----------+---------+");
            for (int i = 0; i < data; i++) {
                pw.printf("|%-20s|%-11s|%-9s|\n", nama[i], nim[i], angkatan[i]);
            }
            pw.println("+--------------------+-----------+---------+");
            System.out.println("Berhasil membuat file");

        } catch (IOException ioe) {
            System.out.println("Gagal membuat file");
        } finally {
            try {
                if (fw != null) {
                    fw.close();
                }
                if (pw != null) {
                    pw.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}