import java.util.Scanner;
import java.io.*;

/**
 * Tugas01
 */
public class Tugas01 {

    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        boolean isSuccess = false;
        try {
            String file1 = input.nextLine();
            String file2 = input.nextLine();
            fileReader = new FileReader(file1+".txt");
            fileWriter = new FileWriter(file2+".txt");
            bufferedReader = new BufferedReader(fileReader);
            printWriter = new PrintWriter(fileWriter);
            String str;
            while ((str = bufferedReader.readLine()) != null) {
                printWriter.println(str);
                isSuccess = true;
            }
            if (isSuccess == true) {
                System.out.println("Berhasil");
            } else {
                System.out.println("Gagal");
            }
            input.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Gagal");
        } finally {
            try {
                if(fileReader != null){
                    fileReader.close();
                }
                if(fileWriter != null){
                    fileWriter.close();
                }
                if(bufferedReader != null){
                    bufferedReader.close();
                }
                if(printWriter != null){
                    printWriter.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}