import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;

class CopyText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input name of source file (.txt): ");
        String source = input.next();
        System.out.print("Save as : ");
        String output = input.next();
        FileReader fileR = null;
        FileWriter fileW = null;
        BufferedReader in = null;
        BufferedWriter out = null;
        ArrayList<String> lines = new ArrayList<>();
        int longestLineLen =0;
        try {
            fileR = new FileReader(String.format("%s.txt",source));
            fileW = new FileWriter(String.format("%s.txt", output));
            in = new BufferedReader(fileR);
            out = new BufferedWriter(fileW);
            input.close();
            String data;
            while ((data = in.readLine()) != null) {
                lines.add(data);
                if(data.length()>longestLineLen){
                    longestLineLen =data.length();
                }
            }
            for(int i=0;i<lines.size();i++){
                for(int j=0;j<4+longestLineLen-lines.get(i).length();j++){
                    out.write(" ");
                }
                out.write(String.format("%s \n",lines.get(i)));
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
