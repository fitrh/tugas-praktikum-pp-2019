import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int detik,menit,jam;

        detik = input.nextInt();
        menit = detik/60;
        jam = menit/60;

        menit %= 60;
        detik %= 60;
        System.out.printf("%02d:%02d:%02d\n",jam,menit,detik);

      }
    }
