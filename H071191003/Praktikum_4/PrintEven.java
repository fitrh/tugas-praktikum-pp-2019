import java.util.Scanner;
class PrintEven{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int numbers[] = new int[n];
    for (int i = 0; i < n; i++){
      numbers[i] = input.nextInt();
    }
    for(int e : numbers){
      if (e%2==0){
        System.out.print(e + " ");
      }
    }
    System.out.println( );
  }
}
