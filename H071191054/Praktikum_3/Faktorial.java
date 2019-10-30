import java.util.Scanner;

class Faktorial {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("Input jumlah deret faktorial = ");
        int x = sl.nextInt();
        int result = 1;
        System.out.printf("%d! = ", x);
        while (x > 1) {
            System.out.print(x + " * ");
            result *= x;
            x--;
        }
        System.out.printf("%s%n", (result != 1) ? "1 = " + result : result);
    }
}