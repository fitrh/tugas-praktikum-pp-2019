import java.util.Scanner;
class Matrix{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input Ukuran matrix (i,j,k)");
    int i = input.nextInt();
    int j = input.nextInt();
    int k = input.nextInt();

    int matrix_1[][] = new int[i][j];
    int matrix_2[][] = new int[j][k];
    int matrix_3[][] = new int[i][k];
    System.out.printf("Input matrix 1 (%d x %d)\n",i,j);
    for (int a = 0 ; a<i; a++){
      for(int b=0; b<j; b++){
        matrix_1[a][b] = input.nextInt();
      }
    }
    System.out.printf("Input matrix 2 (%d x %d)\n",j,k);
    for (int a = 0 ; a < j; a++){
      for(int b = 0; b < k ; b++){
        matrix_2[a][b] = input.nextInt();
      }
    }

    for (int a =0 ; a<i ;a++ ) {
      for (int b=0; b<j ;b++ ) {
        for (int c=0; c<k ;c++ ) {
          matrix_3[a][c] += matrix_1[a][b] * matrix_2[b][c];
        }
      }
    }
    System.out.printf("\nMatrix 3 (%d x %d)\n",i,k);
    for (int a =0 ; a<i ;a++ ) {
      for (int b=0; b<k ;b++ ) {
        System.out.print(matrix_3[a][b] + " ");
      }
      System.out.println();
    }
  }
}
