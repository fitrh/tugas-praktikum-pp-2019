import java.util.Scanner;
class BinaryToInt{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input Binary Number: ");
    String binaryNumber = input.next();
    System.out.print(binaryNumber + " in decimals = ");
    System.out.println(binaryConverter(binaryNumber));
  }

  static int binaryConverter(String binary){
    int counter =0;
    int sum =0;
    for(int i =binary.length()-1; i>=0; i--){
      if((int)binary.charAt(i)==49){
        sum += Math.pow(2,counter);

      }
      counter++;
    }
      return sum;
  }
}
