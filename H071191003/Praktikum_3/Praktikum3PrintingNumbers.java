import java.util.Scanner;
class Praktikum3PrintingNumbers{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input nilai x");
    int x = input.nextInt();
    System.out.println("Input nilai y");
    int y = input.nextInt();
    for(int i = 1; i<= y;i++){
      System.out.print( (i%x==0)? (i +"\n") : i +"\t" );
    }
    System.out.println();

  }
}
