import java.util.Scanner;
import java.util.Random;
class SerialNumberGenerator{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input banyaknya blok : ");
    int n = input.nextInt();
    System.out.print("Input berapa digit yang terdapat dalam satu blok : ");
    int m = input.nextInt();
    String serialNumber = generateSerial(n,m);
    System.out.println(serialNumber);
  }
  public static String generateSerial(int n, int m) {
    Random random = new Random();
    String str = "";
    int nCounter = 0;
    while(nCounter <n && n>0){
      for(int i =0;i<m;i++){
        str += random.nextInt(10);
      }
      nCounter++;
      if (nCounter <n){
        str += "-";
      }
    }
    return str;
  }

}
