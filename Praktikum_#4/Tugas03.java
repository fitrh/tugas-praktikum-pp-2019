import java.util.Scanner;
/**
 * Tugas03
 */
public class Tugas03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m = input.nextInt();
        int[] arr1 = new int[m];
        int sum = 0;
        for (int i = 0; i < m; i++){
            arr1[i] = input.nextInt();
            sum += arr1[i];
        }
        int n = input.nextInt();
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++){
            boolean isSame = false;
            arr2[i] = input.nextInt();
            for (int j = 0; j < m; j++){
                if (arr2[i] == arr1[j]) isSame = true;
            }
            sum += !isSame ? arr2[i] : 0;
        }
        System.out.println(sum);
        input.close();
    }
}