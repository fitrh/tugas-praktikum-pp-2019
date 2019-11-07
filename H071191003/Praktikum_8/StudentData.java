import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
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
        ArrayList<String> dataList = new ArrayList<>();
        int longestLineLen = 0;
        try {
            fileR = new FileReader(String.format("%s.txt", source));
            fileW = new FileWriter(String.format("%s.txt", output));
            in = new BufferedReader(fileR);
            out = new BufferedWriter(fileW);
            input.close();
            String data;
            int nameLen =4;
            int NIMLen = 3;
            int batchLen = 5;
            int iterate=0;
            while ((data = in.readLine()) != null) {
                dataList.add(data);
                if (iterate%3==0 && data.length() > nameLen) {
                    nameLen = data.length();
                }else if(iterate%3==1 && data.length()>NIMLen){
                    NIMLen = data.length();
                }else if (iterate%3==2 && data.length()>batchLen){
                    batchLen = data.length();
                }
                iterate++;
            }        
            Iterator<String> iterator = dataList.iterator();
            int sizeI=(int)Math.ceil((double)dataList.size()/3)+4;    
            int sizeJ;            
            for(int i=0;i<(sizeI=(sizeI==4?3:sizeI));i++){
                for(int j=0;j<(sizeJ = (nameLen + NIMLen + batchLen>16? nameLen + NIMLen + batchLen+4:16));j++){
                    if (j == 0 || j == nameLen + 1 || j == NIMLen + 2 + nameLen || j == batchLen + 3 + NIMLen + nameLen) {
                        if(i==0 || i==2 || i==sizeI-1){
                            out.write("+");
                        }else{
                            out.write("|");
                        }
                    }else if(i==0 || i==2 || i == sizeI-1){
                        out.write("-");
                    } else if (i > 2 && (j == 1 || j == nameLen + 2 || j == NIMLen + nameLen + 3)) {
                        try {
                            if (j == 1) {
                                out.write((data = iterator.next()));
                                j += data.length() - 1;
                            } else if (j == nameLen + 2) {
                                out.write((data = iterator.next()));
                                j += data.length() - 1;
                            } else if (j == NIMLen + nameLen + 3) {
                                out.write((data = iterator.next()));
                                j += data.length() - 1;
                            }
                        } catch (Exception e) {
                            out.write("-");
                        }
                    }else if(i==1&&(j==1 ||j==nameLen+2||j==NIMLen+nameLen+3)){
                        if (j == 1) {
                            out.write("Name");
                            j += 3;                            
                        } else if (j == nameLen + 2) {
                            out.write("NIM");
                            j += 2;
                        } else if(j==NIMLen+nameLen+3){
                            out.write("Batch");
                            j += 4;
                        }
                    }else {
                        out.write(" ");
                    }
                }
                out.write("\n");
                
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
