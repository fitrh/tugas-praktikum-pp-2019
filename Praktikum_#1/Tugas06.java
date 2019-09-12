import java.util.Scanner;
/**
 * Tugas06
 */
public class Tugas06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();

        int hThousand = a / 100000;
        a = a % 100000;
        int ftThousand = a / 50000;
        a = a % 50000;
        int ttThousand = a / 20000;
        a = a % 20000;
        int tThousand = a / 10000;
        a = a % 10000;
        int fThousand = a / 5000;
        a = a % 5000;
        int twThousand = a / 2000;
        a = a % 2000;
        int thousand = a / 1000;


        System.out.println("Jumlah Uang Rp. 100.000 : "+hThousand);
        System.out.println("Jumlah Uang Rp. 50.000 : "+ftThousand);
        System.out.println("Jumlah Uang Rp. 20.000 : "+ttThousand);
        System.out.println("Jumlah Uang Rp. 10.000 : "+tThousand);
        System.out.println("Jumlah Uang Rp. 5.000 : "+fThousand);
        System.out.println("Jumlah Uang Rp. 2.000 : "+twThousand);
        System.out.println("Jumlah Uang Rp. 1.000 : "+thousand);
    }
}