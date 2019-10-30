import java.util.Scanner;
import java.util.Random;

class Modul2Method {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int n = sl.nextInt();
        int m = sl.nextInt();

        String serialNumber = generateSerial(n, m);
        System.out.println(serialNumber);
    }

    public static String generateserial(int n, int m) {
        Random r = new Random();
        String str = "";
        int[][] mixnumber = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mixnumber[i][j] += r.nextInt(10);
                str += mixnumber[i][j];
            }
            str += i == n - 1 ? "" : "-";
        }
        return str;
    }
}