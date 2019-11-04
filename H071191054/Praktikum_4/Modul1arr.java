import java.util.Scanner;

class Modul1arr {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int n = sl.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sl.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int x = arr[i];
                int y = arr[j];
                do {
                    int c = y;
                    y = x % y;
                    x = c;
                } while (y != 0);
                if (x == 1) {
                    System.out.printf("%d %d %n", arr[i], arr[j]);
                }
            }
        }
    }
}