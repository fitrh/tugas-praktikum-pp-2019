import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
class CopyText {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Save as : ");
        String source = input.next();
        FileWriter fileW = null;
        BufferedWriter out = null;
        ArrayList<String> dataList = new ArrayList<>();
        try {
            fileW = new FileWriter(String.format("%s.txt", source));
            out = new BufferedWriter(fileW);
            String data;
            System.out.print("Input number of inputs : ");
            int n = input.nextInt();
            input.nextLine();
            int iterate=0;
            int nameLen = 4;
            int NIMLen = 3;
            int batchLen = 5;
            String[] dataType = {"Name : ","NIM : ","Batch : "};
            while(iterate !=n*3){
                if(iterate%3==0){
                    System.out.printf("####Person %d####\n",((iterate/3)+1));
                }
                System.out.print(dataType[iterate%3]);
                 data = input.nextLine();
                dataList.add(data);
                if (iterate % 3 == 0 && data.length() > nameLen) {
                    nameLen = data.length();
                } else if (iterate % 3 == 1 && data.length() > NIMLen) {
                    NIMLen = data.length();
                } else if (iterate % 3 == 2 && data.length() > batchLen) {
                    batchLen = data.length();
                }
                iterate++;
            }        
            input.close();
            Iterator<String> iterator = dataList.iterator();
            int sizeI=(int)Math.ceil((double)dataList.size()/3)+4;    
            int sizeJ;            
            for(int i=0;i<(sizeI=(sizeI==4?3:sizeI));i++){
                for(int j=0;j<(sizeJ = nameLen + NIMLen + batchLen+4);j++){
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
            System.out.println("Success!");

        } catch (IOException e) {
            System.out.println("Fail!");
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                System.out.println("Fail!");
            }
        }

    }
}
