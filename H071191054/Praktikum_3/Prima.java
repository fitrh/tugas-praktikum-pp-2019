import java.util.Scanner;

class Prima {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.printf("Input jumlah deret bilangan prima = ");
        int x = sl.nextInt();
        int jumlah = 0;
        boolean kondisi;

        for (int i = 2; i <= x; i++) {
            kondisi = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    kondisi = false;
                }
            }
            if (kondisi) {
                System.out.print(i + " ");
                jumlah++;
            }
        }
        System.out.printf("%nJumlah bilangan prima = " + jumlah);
    }
}