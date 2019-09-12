/*Arsyi Syarief Aziz 
  NIM : H071191003
*/
import java.util.Scanner;
class Praktikum1No3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input tinggi mercusuar ...");
    float height = input.nextFloat();
    System.out.print("Input sudut antara mercusuar dan belakang kapal (0 < θ < 90)...");
    int angle = input.nextInt();
    float angleB = (float)Math.toRadians(angle);
    System.out.print("Input sudut antara mercusuar dan depan kapal (0 < θ < 90)...");
    angle = input.nextInt();
    float angleF= (float)Math.toRadians(angle);
    float totalLength;
    float sFLength;
    float opp;
    sFLength = (float)Math.tan(angleF)*height;
    opp = (float)Math.tan(angleB)*height;
    float shipLength = (opp-sFLength);
    System.out.printf("Panjang Kapal = %.1f \n", shipLength);
  }
}
