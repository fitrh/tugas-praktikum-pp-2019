import java.util.Scanner;
/**
 * Tugas02
 */
public class Tugas02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        int j = input.nextInt();
        int k = input.nextInt();
        int[][] a = new int [i][j];
        int[][] b = new int [j][k];
        int[][] c = new int [i][k];
        for (int l = 0; l < i; l++) {
            for (int m = 0; m < j; m++) {
                a[l][m] = input.nextInt();
            }
        }
        for (int l = 0; l < j; l++) {
            for (int m = 0; m < k; m++) {
                b[l][m] = input.nextInt();
            }
        }
        for (int l = 0; l < i; l++) {
            for (int m = 0; m < k; m++) {
                c[l][m] = 0;
                for (int n = 0; n < j; n++) {
                    c[l][m]+=a[l][n]*b[n][m];
                }
                System.out.print(c[l][m]+" ");
            }
            System.out.println();
        }
    }
}