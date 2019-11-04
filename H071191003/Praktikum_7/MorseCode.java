import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
class MorseCode{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input morse code : ");
    System.out.println("Translated code : "+processWord(input.nextLine()));
  }

  static String processWord(String word){
    int firstIndexOfSubstring = 0;
    String output = "";
    for(int i=0;i<word.length();i++){
      if(word.charAt(i)==' '){
        output += findChar(word.substring(firstIndexOfSubstring,i));
        firstIndexOfSubstring = i+1;
      }else if (i == word.length()-1){
        i++;
        output += findChar(word.substring(firstIndexOfSubstring,i));
      }
    }
    return output;
  }
  static char findChar(String code){
    HashMap<String,Character> characters = new HashMap<>();
    characters.put(".-",'A');
    characters.put("-...",'B');
    characters.put("-.-.",'C');
    characters.put("-..",'D');
    characters.put(".",'E');
    characters.put("..-.",'F');
    characters.put("--.",'G');
    characters.put("....",'H');
    characters.put("..",'I');
    characters.put(".---",'J');
    characters.put("-.-",'K');
    characters.put(".-..",'L');
    characters.put("--",'M');
    characters.put("-.",'N');
    characters.put("---",'O');
    characters.put(".--.",'P');
    characters.put("--.-",'Q');
    characters.put(".-.",'R');
    characters.put("...",'S');
    characters.put("-",'T');
    characters.put("..-",'U');
    characters.put("...-",'V');
    characters.put(".--",'W');
    characters.put("-..-",'X');
    characters.put("-.--",'Y');
    characters.put("--..",'Z');
    characters.put(".----",'1');
    characters.put("..---",'2');
    characters.put("...--",'3');
    characters.put("....-",'4');
    characters.put(".....",'5');
    characters.put("-....",'6');
    characters.put("--...",'7');
    characters.put("---..",'8');
    characters.put("----.",'9');
    characters.put("-----",'0');
    if(characters.get(code)==null){
      return '#';
    }else{
      return characters.get(code);
    }
  }

}
