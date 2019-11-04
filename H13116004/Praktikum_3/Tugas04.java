import java.util.Scanner;
/**
 * Tugas04
 */
public class Tugas04 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int harga;

        while ((harga = input.nextInt()) > 0) {
            int uang = input.nextInt();
            int kembalian = uang - harga;
            int hThousand = kembalian / 100000;
            kembalian = kembalian % 100000;
            int ftThousand = kembalian / 50000;
            kembalian = kembalian % 50000;
            int ttThousand = kembalian / 20000;
            kembalian = kembalian % 20000;
            int tThousand = kembalian / 10000;
            kembalian = kembalian % 10000;
            int fThousand = kembalian / 5000;
            kembalian = kembalian % 5000;
            int twThousand = kembalian / 2000;
            kembalian = kembalian % 2000;
            int thousand = kembalian / 1000;


            System.out.println(hThousand+" Uang Rp. 100.000");
            System.out.println(ftThousand+" Uang Rp. 50.000");
            System.out.println(ttThousand+" Uang Rp. 20.000");
            System.out.println(tThousand+" Uang Rp. 10.000");
            System.out.println(fThousand+" Uang Rp. 5.000");
            System.out.println(twThousand+" Uang Rp. 2.000");
            System.out.println(thousand+" Uang Rp. 1.000");
            break;
        }

        input.close();

    }
}