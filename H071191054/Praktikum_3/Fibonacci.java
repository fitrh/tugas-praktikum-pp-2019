import java.util.Scanner;

class Fibonacci {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("Input jumlah deret fibonacci = ");
        int x = sl.nextInt();
        long n0 = 0;
        long n1 = 1;

        for (int i = 0; i <= x; i++) {
            System.out.print(n0 + " ");
            long n = n0 + n1;
            n0 = n1;
            n1 = n;
        }
    }
}