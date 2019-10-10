import java.util.Scanner;
public class Nomor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        // for (int i = (x > y ? y : x); i <= (x > y ? x : y); i++) {
        //     System.out.print(i + ((i == 0) ? "" : (i % 2 == 0) ? " Genap" : " Ganjil"));
        //     System.out.print(((i == 0) ? " Nol" : (i < 0) ? " Negatif" : " Positif") + "\n");
        // }
        for (int i = (x > y ? y : x); i <= (x > y ? x : y); i++) {
            if (i == 0) {
                System.out.print("");
            }else if (i % 2 == 0) {
                System.out.print(i +" Genap");
            }else {
                System.out.print(i +" Ganjil");
            }

            if (i == 0) {
                System.out.print(i +" Nol\n");
            }else if (i < 0) {
                System.out.print(" Negatif\n");
            }else {
                System.out.print(" Positif\n");
            }
        }
        input.close();
    }
}
