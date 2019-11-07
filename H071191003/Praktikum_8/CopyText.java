import java.io.*;
import java.util.Scanner;
class CopyText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input name of source file (.txt): ");
        String source = input.next();
        System.out.print("Save as : ");
        String output = input.next();
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(String.format("%s.txt",source));
            out = new FileOutputStream(String.format("%s.txt",output));
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
            if (in != null) {
                in.close();
            }
            if (in != null) {
                out.close();
            }
            System.out.println("Success!");
        } catch (IOException e) {
            System.out.println("Fail!");
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
                if (in != null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println("Fail!");
            }
        }
        
    }
}
