import java.util.*;
class Tugas02_Final_H071191008{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();
        int q = input.nextInt();
        int r = input.nextInt();
        int s = input.nextInt();

        int[][] matrixA = new int [p][q];
        int[][] matrixB = new int [r][s];
        int sum;

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                matrixA[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < s; j++) {
                matrixB[i][j] = input.nextInt();
            }
        }
        // AB
        if (q != r) {
            System.out.print("Perkalian tidak bisa dilakukan");
        }else {
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < s; j++) {
                    sum = 0;
                    for (int k = 0; k < q; k++) {
                        sum = sum + matrixA[i][k] * matrixB[k][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }

        //BA
        if (q != r) {
            System.out.print("Perkalian tidak bisa dilakukan");
        } else {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < q; j++) {
                    sum = 0;
                    for (int k = 0; k < s; k++) {
                        sum = sum + matrixB[i][k] * matrixA[k][j];
                    }
                    System.out.print(sum + " ");
                }
                System.out.println();
            }
        }
    }
}
