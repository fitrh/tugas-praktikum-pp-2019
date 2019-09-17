import java.util.Scanner;
class Praktikum1ExtraNo4{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input Jumlah Uang... Rp.");
    int n = Math.max(input.nextInt(),0);
    int a100000 = n/100000;
    n %= 100000;
    System.out.printf("Jumlah uang Rp.100.000 = %d \n",a100000);
    int a50000 = n/50000;
    n %= 50000;
    System.out.printf("Jumlah uang Rp.50.000 = %d \n",a50000);
    int a20000 = n/20000;
    n %= 20000;
    System.out.printf("Jumlah uang Rp.20.000 = %d \n",a20000);
    int a10000 = n/10000;
    n %= 10000;
    System.out.printf("Jumlah uang Rp.10.000 = %d \n",a10000);
    int a5000 = n/5000;
    n %= 5000;
    System.out.printf("Jumlah uang Rp.5.000 = %d \n",a5000);
    int a2000 = n/2000;
    n %= 2000;
    System.out.printf("Jumlah uang Rp.2.000 = %d \n",a2000);
    int a1000 = n/1000;
    n %= 1000;
    System.out.printf("Jumlah uang Rp.1.000 = %d \n",a1000);

  }

}