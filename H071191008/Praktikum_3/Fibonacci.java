import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int a = 0;
        int b = 1;
        for (int i = 0;a <= n;i++) {
            System.out.print(a+ " ");
            i = a + b;
            a = b;
            b = i;
        }
    }
}
