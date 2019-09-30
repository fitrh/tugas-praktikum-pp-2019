import java.util.Scanner;
class Faktorial{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
      int x;
      int y;
      int total=1;

      int n = input.nextInt();
      for (x = n;x>=1;x--) {
        System.out.print(x+" ");
      }
      for (y=1;y<=n;y++) {
        total=y*total;
      }
      System.out.print("= "+total);
  }
}
