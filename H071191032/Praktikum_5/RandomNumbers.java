import java.util.Scanner;
import java.util.Random;
class RandomNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        sc.close();
        
        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }
    
    public static String generateSerial(int n, int m) {
        Random rand = new Random();
        String str = "";
        int[][] mixNumber = new int [n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mixNumber[i][j] += rand.nextInt(10);
                str += mixNumber[i][j];
            }
            str += i == n - 1 ? "" : "-";
        }
        return str;
    }
}