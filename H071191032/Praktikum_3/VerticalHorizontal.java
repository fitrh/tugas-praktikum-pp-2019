import java.util.Scanner;
class VerticalHorizontal{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int x = sc.nextInt(); 
        int y = sc.nextInt();

        for ( int i = 0, j = 1; i <= y ; i++, j++){
            System.out.printf("%2d%s", i, j % x == 0 ? "\n" : " ");
        }
    }
}