//Tugas Final 02
import java.util.Scanner;
/**
 * Matrix
 */
public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Baris A : ");
        int p = input.nextInt();
        System.out.println("Masukkan Kolom A : ");
        int q = input.nextInt();
        System.out.println("Masukkan Baris B : ");
        int r = input.nextInt();
        System.out.println("Masukkan Kolom B : ");
        int s = input.nextInt();
        int[][] a = new int [p][q];
        int[][] b = new int [r][s];
        int[][] ab = new int [p][s];
        int[][] ba = new int [r][q];
        
        if (q == r && s == p){
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print("A("+i+", "+j+") : ");
                    a[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.print("B("+i+", "+j+") : ");
                    b[i][j] = input.nextInt();
                }
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    ab[i][j] = 0;
                    for (int k = 0; k < r; k++) {
                        ab[i][j]+=a[i][k]*b[k][j];
                    }
                }
            }
            System.out.println("Matriks AB : \n");
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.print(ab[i][j]+" ");
                }
                System.out.println();
            }
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < q; j++) {
                    ba[i][j] = 0;
                    for (int k = 0; k < p; k++) {
                        ba[i][j]+=b[i][k]*a[k][j];
                    }
                }
            }
            System.out.println();
            System.out.println("Matriks BA : \n");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(ba[i][j]+" ");
                }
                System.out.println();
            }
        } else {
            System.out.println("Matriks A tidak simetris dengan Matriks B");
        }
        input.close();

    }
}