import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * Tugas03
 */
public class Tugas03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            int c = input.nextInt();
            int d = input.nextInt();
            int e = input.nextInt();
            int genap = 0; 
            int ganjil = 0; 
            int positif = 0;
            int negatif = 0;
            if (a%2== 0 || b%2 == 0 || c%2 == 0 || d%2 == 0 || e%2 == 0){
                if (a%2==0) genap++;
                if (b%2==0) genap++;
                if (c%2==0) genap++;
                if (d%2==0) genap++;
                if (e%2==0) genap++;
                System.out.println(genap+" Angka Genap");
            } 
            if (a%2== 1 || b%2 == 1 || c%2 == 1 || d%2 == 1 || e%2 == 1) {
                if (a%2==1) ganjil++;
                if (b%2==1) ganjil++;
                if (c%2==1) ganjil++;
                if (d%2==1) ganjil++;
                if (e%2==1) ganjil++;
                System.out.println(ganjil+" Angka Ganjil");
            }
            if (a > 0 || b > 0 || c > 0 || d > 0 || e > 0){
                if (a > 0) positif++;
                if (b > 0) positif++;
                if (c > 0) positif++;
                if (d > 0) positif++;
                if (e > 0) positif++;
                System.out.println(positif+" Angka Positif");
            }
            if (a < 0 || b < 0 || c < 0 || d < 0 || e < 0){
                if (a < 0) negatif++;
                if (b < 0) negatif++;
                if (c < 0) negatif++;
                if (d < 0) negatif++;
                if (e < 0) negatif++;
                System.out.println(negatif+" Angka Negatif");
            }
        } catch (InputMismatchException e) {
            System.out.println("Inputan Tidak Valid");
        }
    }
}