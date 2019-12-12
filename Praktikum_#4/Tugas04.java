import java.util.Scanner;
/**
 * Tugas04
 */
public class Tugas04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []arr = new int[n];
        boolean isEmpty = true;
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++){
                if (arr[i] ==arr[j]) {
                    System.out.println("Terdapat bagian yang sama yaitu "+arr[i]+" yang terletak di index "+i+", "+j);
                    isEmpty = false;
                }
            }
        }
        if (isEmpty) {
            System.out.println("Tidak ada nilai yg sama");
        }

    }
}