import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;
class SelfDivision{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input starting number : ");
    int start = input.nextInt();
    System.out.print("Input end number : ");
    int end = input.nextInt();
    for(int i = start; i<=end;i++){
      if(canSelfDivide(i)){
        System.out.print(i+" ");
      }
    }
  }
  static boolean canSelfDivide(int number){
    Iterator<Integer> iterator = seperateDigits(number).iterator();
    try{
      while(iterator.hasNext()){
        if(number % iterator.next()==0){
          continue;
        }else{
          return false;
        }
      }
    }catch(ArithmeticException e){
      return false;
    }
    return true;
  }
  static List<Integer> seperateDigits(int number){
    List<Integer> seperatedDigits = new ArrayList<Integer>();
    while (number > 0) {
      seperatedDigits.add(number % 10);
      number = number / 10;
    }
    return(seperatedDigits);
  }
}
