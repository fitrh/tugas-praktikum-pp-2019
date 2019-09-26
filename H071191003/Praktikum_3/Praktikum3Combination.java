import java.util.Scanner;
class Praktikum3Combination{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input nilai N ... ");
    int n = input.nextInt();
    System.out.println("Input nilai R ... ");
    int r = input.nextInt();
    long nFactorial =1;
    long nrFactorial =1;
    long rFactorial=1;
    for (int i =1;i<=n;i++){
      nFactorial *= i;
    }
    for (int i =1;i<=(n-r);i++){
      nrFactorial *= i;

    }
    for (int i =1;i<=r;i++){
      rFactorial *= i;
    }
    long combination = nFactorial/(nrFactorial*rFactorial);
    System.out.println(n +" kombinasi "+ r +" = "+combination);
  }
}
