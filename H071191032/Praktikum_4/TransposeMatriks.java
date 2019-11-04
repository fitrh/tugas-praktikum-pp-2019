import java.util.Scanner;
class TransposeMatriks{
    public static void main(String[] args) {
        Scanner ardnn = new Scanner (System.in);
        int baris = ardnn.nextInt();
        int kolom = ardnn.nextInt();
        int[][] matriks = new int [baris][kolom];

        //input matriks
        for( int i = 0; i < baris; i++){
            for ( int j = 0; j < kolom; j++){
                matriks [i][j] = ardnn.nextInt();
            }
        }

        System.out.println("=========");
        //transpose matriks 
        for ( int i = 0; i < matriks[0].length; i++){
            for ( int j = 0; j < matriks.length; j++){
                System.out.print(matriks[j][i] + " ");
            }
            System.out.println();
        }
    }
}