import java.util.Scanner;
class SentenceChanger{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input sentence :");
    String word = input.nextLine();
    double wordLen = Math.ceil(word.length()/2);
    String processedWord = word.substring(0,wordLen).replaceAll("\\s","").toUpperCase();
    for (int i = processedWord.length()-2; i>=0; i--){
      processedWord += processedWord.charAt(i);
    }
    String hexa = String.format("%x",word.length()*word.length()) ;
    String octal = String.format("%o",word.length()) ;
    System.out.printf("#%s%s%s%s\n",hexa,processedWord,octal,(hexa.charAt(0)>=48 &&hexa.charAt(0)<=57?"!":"?"));
  }
}
