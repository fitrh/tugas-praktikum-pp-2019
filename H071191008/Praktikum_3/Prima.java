import java.util.Scanner;
class Prima {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int k = 0;
    System.out.print(n + " Bilangan Prima Pertama:\n");
    for (int i = 2;;i++) {
      boolean prima = true;
      for (int j = 2; j < i ;j++ ) {
          if (i % j == 0) {
            prima = false;
            break;
          }
        }
      if (prima) {
          k++;
          if (k <= n) {
              System.out.print(i+ " ");
              continue;
          }else {
              break;
          }
        }
    }
  }
}
