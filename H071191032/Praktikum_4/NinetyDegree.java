import java.util.Scanner;
class NinetyDegree{
    public static void main(String[] args) {
        Scanner putt = new Scanner (System.in);
        int baris = putt.nextInt();
        int kolom = putt.nextInt();
        int[][] array = new int[baris][kolom];

        //input matriks
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                array[i][j] = putt.nextInt();
            }
        }

        System.out.println();
        //rotate matriks
        for(int i = 0; i < kolom; i++){
            for( int j = baris - 1; j >= 0; j--){
                System.out.print(array[j][i] + " ");
            }
            System.out.println();
        }
    }
}