import java.util.Scanner;
class Praktikum1No1{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input jumlah jam (h)... ");
    int t = input.nextInt();
    float eff = (float)14;
    System.out.print("Input kecepatan rata-rata (km/h)... ");
    int kh = input.nextInt();
    float  dis = (float)t*kh;
    float fuel = (float)dis/eff;
    System.out.printf("Bensin Yang Digunakan : %.3f L \n", fuel);
  }
}