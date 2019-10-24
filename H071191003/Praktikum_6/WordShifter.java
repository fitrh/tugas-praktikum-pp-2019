import java.util.Scanner;
class WordShifter{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input word : ");
    String word = input.next();
    System.out.println("----Menu-----");
    System.out.println("1. Shift up");
    System.out.println("2. Shift down");
    System.out.print("Choice : ");
    byte choice = input.nextByte();
    if(choice ==1 || choice ==2){
      System.out.printf("Input the number of shifts ");
      if (choice ==1){
        System.out.print("up : ");
      }else if(choice ==2){
        System.out.print("down : ");
      }
    }else{
      System.out.println("Invalid input!");
      return;
    }
    int shift = input.nextInt();
    String newWord = "";
    for (int i=0;i<word.length() ;i++ ) {
      newWord += (char)(word.charAt(i) + (choice==1?shift:shift*-1) );
    }
    System.out.println("Output : "+newWord);
  }
}
