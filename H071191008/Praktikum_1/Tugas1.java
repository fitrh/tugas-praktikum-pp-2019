import java.util.Scanner;
public class Tugas1 {
  public static void main(String[] args){
    Scanner input = new Scanner (System.in);
    int waktu;
    int kecepatan;
    float hasil;

    waktu = input.nextInt();
    kecepatan = input.nextInt();
    hasil = (float)waktu * kecepatan / 14;
    System.out.printf("Bensin Yang Digunakan : %.3f ",hasil);
  }
}
