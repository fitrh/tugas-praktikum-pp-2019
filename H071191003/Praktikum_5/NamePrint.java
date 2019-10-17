import java.util.Scanner;
import java.util.Random;
class NamePrint{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    char name[] = input.nextLine().toCharArray();
    int n = name.length;
    int addedLine = (n-5)>0?n-5:0;
    for(int i =0; i<5+(addedLine*2);i++){
      for(int j=0, max = name.length+4; j<max;j++){
        if(i<1+addedLine || i>3+addedLine ||j==0||(j==max-1)){
          System.out.print("["+changeCase(name[randomiseChar(n)])+"]");
        }else if ((j>1 && j<name.length+2)&& i==2+addedLine){
            int k = j-2;
            System.out.print(" "+upperCase(name[k])+" ");
        }else{
          System.out.print("[ ]");
        }
      }
      System.out.println();
    }
  }
  static int randomiseChar(int charLen){
    Random random = new Random();
    int index = random.nextInt(Integer.MAX_VALUE)%charLen;
    return index;
  }
  static char changeCase(char character){
    char output;
    if (character>='A' && character<'Z'){
      int input = (int)character;
      output = (char)(character+32);
    }else if(character == ' '){
      return '#';
    }else{
      return character;
    }
    return output;
  }
  static char upperCase(char character){
    char output;
    if (character>='a' && character<'z'){
      int input = (int)character;
      output = (char)(character-32);
    }else{
      return character;
    }
    return output;
  }
}
