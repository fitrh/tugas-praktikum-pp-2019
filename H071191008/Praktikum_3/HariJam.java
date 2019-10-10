import java.util.Scanner;
class HariJam{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float jam = 0;
        float menit = 0;
        float detik = 0;
        float n = 240 * input.nextFloat();

        for (int i = 1;i <= n;i++) {
            detik++;
        }
        menit = detik/60;
        jam = menit/60;
        menit %= 60;
        detik %= 60;
        if (n <= 64800) {
            jam = jam + 6;
        }


        System.out.printf("%f:%f:%f\n",jam,menit,detik);
    }
}
