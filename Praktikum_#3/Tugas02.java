import java.util.Scanner;
/**
 * Tugas02
 */
public class Tugas02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        input.close();
        for (int i = 0; i <= y; i++) {
            System.out.printf("%d ",i);
            if (i%x == x-1) System.out.println();
        }
        System.out.println();
    }
}