import java.util.Scanner;

class Modul2arr {
    public static void main(String[] args) {
        // Perkalian Matriks
        Scanner sl = new Scanner(System.in);
        int i = sl.nextInt();
        int j = sl.nextInt();
        int k = sl.nextInt();
        int[][] matriksA = new int[i][j];
        int[][] matriksB = new int[j][k];

        for (int a = 0; a < i; a++) {
            for (int b = 0; b < j; b++) {
                matriksA[a][b] = sl.nextInt();
            }
        }
        for (int b = 0; b < j; b++) {
            for (int c = 0; c < k; c++) {
                matriksB[b][c] = sl.nextInt();
            }
        }
        for (int a = 0; a < i; a++) {
            for (int c = 0; c < k; c++) {
                int hasil = 0;
                for (int b = 0; b < j; b++) {
                    hasil += matriksA[a][b] * matriksB[b][c];
                }
                System.out.print(hasil + " ");
            }
            System.out.println();
        }
    }
}