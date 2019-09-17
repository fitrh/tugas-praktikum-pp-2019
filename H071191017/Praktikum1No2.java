import java.util.Scanner;
class Praktikum1No2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input detik...");
    int s = input.nextInt();
    int m = s/60;
    s %= 60;
    int h = m/60;
    m %=60;
    System.out.printf("%02d:%02d:%02d \n\n",h,m,s);
  }
}