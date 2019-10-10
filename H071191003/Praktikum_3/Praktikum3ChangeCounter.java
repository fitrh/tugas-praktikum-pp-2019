import java.util.Scanner;
class Praktikum3ChangeCounter{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input harga barang... ");
    int price = input.nextInt();
    System.out.print("Input jumlah uang yang diberi... ");
    int money = input.nextInt();
    int change = (money-price);
    int counter = 0;
    if (price>money || price<0 || money<0){
      System.out.println("Invalid input!");
      return;
    }
    while(change>=100000){
      change -=100000;
      counter++;
    }
    System.out.printf("%d uang Rp. 100.000\n",counter);
    counter = 0;

    while(change>=50000){
      change -=50000;
      counter++;
    }
    System.out.printf("%d uang Rp. 50.000\n",counter);
    counter = 0;

    while(change>=20000){
      change -=20000;
      counter++;
    }
    System.out.printf("%d uang Rp. 20.000\n",counter);
    counter = 0;

    while(change>=10000){
      change -=10000;
      counter++;
    }
    System.out.printf("%d uang Rp. 10.000\n",counter);
    counter = 0;

    while(change>=5000){
      change -=5000;
      counter++;
    }
    System.out.printf("%d uang Rp. 5.000\n",counter);
    counter = 0;

    while(change>=2000){
      change -=2000;
      counter++;
    }
    System.out.printf("%d uang Rp. 2.000\n",counter);
    counter = 0;

    while(change>=1000){
      change -=1000;
      counter++;
    }
    System.out.printf("%d uang Rp. 1.000\n",counter);
    counter = 0;

  }
}
