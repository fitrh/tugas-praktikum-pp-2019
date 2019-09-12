/*Arsyi Syarief Aziz
  NIM : H071191003
*/
import java.util.Scanner;
class Praktikum1ExtraNo3{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.printf("Input a... ");
    int a = input.nextInt();
    System.out.print("Input b... ");
    int b = input.nextInt();
    Boolean result= ((a%b==0||b%a==0) && a !=0 && b !=0);
    System.out.printf("Apakah %d adalah kelipatan dari %d? ... %b \n",a,b,result);
    }
}
