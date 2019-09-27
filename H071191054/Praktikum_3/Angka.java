import java.util.Scanner;

class Angka {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        System.out.printf("Masukkan angka awal : ");
        int x = sl.nextInt();
        System.out.printf("Masukkan angka akhir : ");
        int y = sl.nextInt();

        for (int i = x > y ? y : x; i <= (x > y ? x : y); i++) {
            String firstWord = i + (i == 0 ? " nol" : i % 2 == 0 ? " genap" : " ganjil");
            String secondWord = i == 0 ? "" : i > 0 ? " positif" : " negatif";
            System.out.printf("%s%s%n", firstWord, secondWord);
        }
    }
}