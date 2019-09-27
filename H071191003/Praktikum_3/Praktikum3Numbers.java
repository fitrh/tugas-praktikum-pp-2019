import java.util.Scanner;
class Praktikum3Numbers{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input batas awal... ");
    int a = input.nextInt();
    System.out.print("Input batas akhir... ");
    int b = input.nextInt();
    if (a>=b){
      System.out.println("Invalid Input");
    }
    for(int i =a;i<=b;i++){
      boolean positive =true;
      boolean even = true;
      if ((Math.abs(i)+i)==0){
        positive = false;
      }
      if (i%2!=0){
        even = false;
      }
      if (i==0){
        System.out.println("0 nol");
      }else if (positive && even){
        System.out.printf("%d genap positif\n",i);
      }else if (positive){
        System.out.printf("%d ganjil positif\n",i);
      }else if (even){
        System.out.printf("%d genap negatif\n",i);
      }else{
        System.out.printf("%d ganjil negatif\n",i);
      }
    }
  }
}
