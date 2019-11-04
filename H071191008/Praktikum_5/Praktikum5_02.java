import java.util.Scanner;
import java.util.Random;
class Praktikum5_02{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int m = scan.nextInt();
    String serialNumber = generateSerial(n,m);
    System.out.println(serialNumber);
  }
  public static String generateSerial(int x, int y){
    Random ace = new Random();
    String str="";
    for(int i=0; i<x; i++){
      for (int j=0; j<y ;j++ ){
        str+=ace.nextInt(10);
      }
      if(i<x-1){
        str+="-";
      }
    }
    return str;
  }
}
