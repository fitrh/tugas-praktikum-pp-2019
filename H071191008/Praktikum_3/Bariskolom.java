import java.util.Scanner;
class Bariskolom{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        for (int i = 0;i <= y;i++) {
            System.out.printf("%d%s",i, (i % x == x-1) ? "\n" : "\t");
        }
    }
}
