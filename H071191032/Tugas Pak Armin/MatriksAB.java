import java.util.Scanner;
class MatriksAB{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Masukkan ukuran matriks A");
        System.out.print("Input p = ");
        int p = sc.nextInt();
        System.out.print("Input q = ");
        int q = sc.nextInt();

        System.out.println("Masukkan ukuran matriks B");
        System.out.print("Input r = ");
        int r = sc.nextInt();
        System.out.print("Input s = ");
        int s = sc.nextInt();
        int[][] matriksA = new int [p][q];
        int[][] matriksB = new int [r][s];
                
            //matriksA
            System.out.println();
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                System.out.printf("Unsur A [%d,%d] = ",i , j);
                matriksA[i][j] = sc.nextInt();
                }
            }

            //matriksB
            System.out.println();
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < s; j++) {
                    System.out.printf("Unsur B [%d,%d] = ",i , j);
                    matriksB[i][j] = sc.nextInt();
                }
            }

            System.out.println();
            //matriksA * matriksB
            int sum;
            if ( q != r){
                System.out.println("Perkalian matriks AB tidak bisa dilakukan!!");
            } else {
                for (int i = 0; i < p; i++) {
                    for (int j = 0; j < s; j++) {
                        sum = 0;
                        for (int k = 0; k < q; k++) {
                            sum += matriksA[i][k] * matriksB[k][j];
                        }
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }
            }

            System.out.println();
            //matriksB * matriksA
            if ( p != s) {
                System.out.println("Perkalian matriks BA tidak bisa dilakukan!!");
            } else {
                for (int i = 0; i < r; i++) {
                    for (int j = 0; j < q; j++) {
                        sum = 0;
                        for (int k = 0; k < s; k++){
                            sum += matriksB[i][k] * matriksA[k][j];
                        }
                        System.out.print(sum + " ");
                    }
                    System.out.println();
                }
            }
    }
}