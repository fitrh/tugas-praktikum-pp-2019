import java.util.Scanner;
class Praktikum3Prime{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input an Integer... ");
    long n = input.nextInt();
    boolean isPrime = true;
    for(long i = 2; i <= Math.sqrt(n); i+=1){
      if(n%i==0){
        isPrime = false;
        break;
      }
    }
    System.out.println( isPrime && n!=1 ? n + " adalah bilangan prima" : n + " bukan bilangan prima");
  }
}
