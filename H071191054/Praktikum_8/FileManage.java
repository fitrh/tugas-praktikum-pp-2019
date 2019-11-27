import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class FileManage {
    static Scanner sl = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("File Manageku");
        System.out.println("1.Buat file");
        System.out.println("2. Baca file");
        System.out.println("3. Duplikat file");
        System.out.println("4. Edit file");
        System.out.println("5. Hapus file");
        int n = sl.nextInt();

        FileReader fr = null;
        BufferedReader br = null;
        FileWriter fw = null;
        PrintWriter pw = null;
        File fl = null;

        switch (n) {
        case 1:
            createfile(fw, pw);
            break;
        case 2:
            readfile(fr, br);
            break;
        case 3:
            duplicatefile(fr, br, fw, pw);
            break;
        case 4:
            editfile(fr, br, fw, pw);
            break;
        case 5:
            deletefile(fl);
            break;
        }
    }

    static void createfile(FileWriter fw, PrintWriter pw) throws IOException {
        System.out.println("Input nama file: ");
        String filename = sl.next() + ".txt";
        System.out.println("Input isi file: ");
        sl.nextLine();
        String content = sl.nextLine();

        fw = new FileWriter(filename);
        pw = new PrintWriter(fw);
        pw.println(content);

        pw.close();
        fw.close();
    }

    static void readfile(FileReader fr, BufferedReader br) throws IOException {
        System.out.println("Input nama file yang akan dibaca: ");
        String filename = sl.next() + ".txt";

        fr = new FileReader(filename);
        br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null) {
            System.out.println(str);
        }
        br.close();
        fr.close();
    }

    static void duplicatefile(FileReader fr, BufferedReader br, FileWriter fw, PrintWriter pw) throws IOException {
        System.out.println("Input nama file yang akan diduplikat : ");
        String oldfilename = sl.next() + ".txt";
        System.out.println("Input nama file baru : ");
        String newfilename = sl.next() + ".txt";

        fr = new FileReader(oldfilename);
        br = new BufferedReader(fr);

        String s;
        String content = " ";
        while ((s = br.readLine()) != null) {
            content += s;
            content += "\n";
        }
        fw = new FileWriter(newfilename);
        pw = new PrintWriter(fw);
        pw.println(content);

        System.out.println("Isi file baru: ");
        System.out.println(content);

        pw.close();
        fw.close();
        br.close();
        fr.close();
    }

    static void editfile(FileReader fr, BufferedReader br, FileWriter fw, PrintWriter pw) throws Exception {
        System.out.println("Input nama file yang akan diedit: ");
        String filename = sl.next() + ".txt";
        System.out.println("Berapa baris yang ingin ditambahkan?");
        int line = sl.nextInt();

        fr = new FileReader(filename);
        br = new BufferedReader(fr);

        int datalength = br.read();
        String data = "";
        while (datalength != -1) {
            data += ((char) datalength);
            datalength = br.read();
        }
        System.out.print(data + "\n");

        fw = new FileWriter(filename);
        pw = new PrintWriter(fw);
        String[] totalLine = new String[line + 1];
        pw.print(data);
        for (int i = 0; i <= line; i++) {
            totalLine[i] = sl.nextLine();
        }
        for (int i = 0; i <= line; i++) {
            if (i == line) {
                pw.print(totalLine[i]);
            } else {
                pw.println(totalLine[i]);
            }
        }
        System.out.print("\n");
        pw.close();
        fw.close();
        br.close();
        fr.close();
    }

    static void deletefile(File fl) throws IOException {
        System.out.println("Input nama file yang akan dihapus: ");
        String filename = sl.next() + ".txt";
        fl = new File(filename);

        fl.delete();
    }
}