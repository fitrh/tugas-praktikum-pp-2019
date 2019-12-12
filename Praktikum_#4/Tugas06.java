import java.util.Scanner;
/**
 * Tugas06
 */
public class Tugas06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] arr = new int[n][n];
        boolean isEmpty = true;
        for(int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                arr[i][j] = input.nextInt();
            }
        }
        for(int i = 1; i < n-1; i++){
            for (int j = 1; j < n-1; j++){
                if (arr[i-1][j] == 1 && arr[i+1][j] == 1 && arr[i][j-1] == 1 && arr[i][j+1] == 1 && arr[i][j] == 0){
                    System.out.println(i+", "+j);
                    isEmpty = false;
                }
            }
        }
        if(isEmpty) System.out.println("Tidak ditemukan");
    }
}