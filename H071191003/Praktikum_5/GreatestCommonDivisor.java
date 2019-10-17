import java.util.Scanner;
class GreatestCommonDivisor{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input 2 angka untuk mencari FPB-nya!");
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    System.out.printf("FPB dari %d dan %d = ",num1,num2);
    System.out.print(cariFPB(num1,num2));
    System.out.println();
  }
  static int cariFPB(int num1,int num2){
    int gcd = 0;
    for(int i=1, max = (num1>num2?num1:num2 ); i<max;i++){
      if(num1%i==0 && num2%i==0){
        gcd = i;
      }
    }
    return gcd;
  }
}
