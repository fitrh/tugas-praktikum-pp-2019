import java.util.Scanner;
/**
 * Tugas01
 */
public class Tugas01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            int gcd = 0;
            for (int j = i+1; j < arr.length; j++) {
                for (int k = arr[i] < arr[j] ? arr[i] : arr[j]; k > 0; k--) {
                    if (arr[i]%k == 0 && arr[j]%k == 0) {
                        gcd = k;
                        break;
                    }
                }
                if (gcd == 1) {
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
        
    }
}