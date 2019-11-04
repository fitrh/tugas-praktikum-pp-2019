import java.util.Scanner;
class MatriksBiner{
    public static void main(String[] args) {
        Scanner putt = new Scanner (System.in);
        int batas = putt.nextInt();
        int[][] matriks = new int [batas][batas];

        //input matriks
        for ( int i = 0; i < batas; i++){
            for ( int j = 0; j < batas; j++){
                matriks[i][j] = putt.nextInt();
            }
        }

        //cek matriks
        for ( int i = 1; i < batas-1; i++){
            for ( int j = 1; j < batas-1; j++){
                if (matriks[i][j] == 0){
                    if ( matriks[i][j+1] == 1  &&  matriks[i][j-1] == 1 && matriks[i+1][j] == 1 && matriks[i-1][j] == 1){
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
         
    }
}