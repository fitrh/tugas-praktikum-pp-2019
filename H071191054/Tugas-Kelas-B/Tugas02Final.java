import java.util.Scanner;

class Tugas02Final {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.println("Input angka untuk menyatakan baris matriks A ");
        int p = sl.nextInt(); // baris matriks A
        System.out.println("Input angka untuk menyatakan kolom matriks A ");
        int q = sl.nextInt(); // kolom matriks A
        System.out.println("Input angka untuk menyatakan baris matriks B");
        int r = sl.nextInt(); // baris matriks B
        System.out.println("Input angka untuk menyatakan kolom matriks B");
        int s = sl.nextInt(); // kolom matriks B
        int[][] matriksA = new int[p][q];
        int[][] matriksB = new int[r][s];

        System.out.println();
        System.out.println("1. Menghitung perkalian matriks A * matriks B");
        System.out.println("2. Menghitung perkalian matriks B * matriks A");
        System.out.println("Input angka sesuai dengan menu yang diinginkan");
        int n = sl.nextInt();

        switch (n) {
        case 1:
            // Perkalian matriks A * matriks B
            if (q == r) {
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < q; j++) {
                        matriksA[i][j] = sl.nextInt();
                    }
                }
                for (int k = 0; k < r; k++) {
                    for (int l = 0; l < s; l++) {
                        matriksB[k][l] = sl.nextInt();
                    }
                }
                System.out.println("Hasil perkalian matriks A * matriks B");
                for (int i = 0; i < p; i++) {
                    for (int l = 0; l < s; l++) {
                        int resultAB = 0;
                        for (int k = 0; k < r; k++) {
                            resultAB += matriksA[i][k] * matriksB[k][l];
                        }
                        System.out.print(resultAB + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Perkalian matriks tidak dapat dilakukan");
            }
            break;

        case 2:
            // Perkalian matriks B * matriks A
            if (p == s) {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < s; j++) {
                        matriksB[i][j] = sl.nextInt();
                    }
                }
                for (int k = 0; k < p; k++) {
                    for (int l = 0; l < q; l++) {
                        matriksA[k][l] = sl.nextInt();
                    }
                }
                System.out.println("Hasil perkalian matriks B * matriks A");
                for (int i = 0; i < r; i++) {
                    for (int l = 0; l < q; l++) {
                        int resultBA = 0;
                        for (int k = 0; k < p; k++) {
                            resultBA += matriksB[i][k] * matriksA[k][l];
                        }
                        System.out.print(resultBA + " ");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Perkalian matriks tidak dapat dilakukan");
            }
            break;
        }
    }
}