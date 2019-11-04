import java.util.Scanner;
/**
 * Tugas01
 */
public class Tugas01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        String oddEven = "";
        input.close();
        if (x < y){
            for (int i = x; i <= y; i++) {
                oddEven = i +" "+ (i != 0 ? (i%2 == 0 ? "genap" : "ganjil")+" "+(i < 0 ? "negatif" : "positif") : "nol");
                System.out.println(oddEven);
            }
        } else if (x > y){
            for (int i = y; i <= x; i++) {
                oddEven = i +" "+ (i != 0 ? (i%2 == 0 ? "genap" : "ganjil")+" "+(i < 0 ? "negatif" : "positif") : "nol");
                System.out.println(oddEven);
            }
        }
    }
}