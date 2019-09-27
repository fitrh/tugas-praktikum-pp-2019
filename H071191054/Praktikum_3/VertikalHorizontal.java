import java.util.Scanner;

class VertikalHorizontal {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.print("Nilai Awal\t: ");
        int i = sl.nextInt();
        System.out.printf("Nilai Akhir\t: ");
        int y = sl.nextInt();
        System.out.printf("Jumlah Kolom\t: ");
        int x = sl.nextInt();

        for (int j = 1; i <= y; j++, i++) {
            System.out.printf(i + "\t");
            if (j % x == 0) {
                System.out.println();
            }
        }
    }
}