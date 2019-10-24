import java.util.Scanner;
class CharacterMatrix{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String sentence = input.nextLine();
    String newSentence ="";
    for(int i=0;i<sentence.length();i++){
      if(i%2==0){
        newSentence += (sentence.charAt(i));
      }else{
        newSentence += (int)(sentence.charAt(i));
      }
    }
    int counter =0;
    for(int i=0;i<4;i++){
      for (int j =0;j<4 ;j++) {
        for (int k=0;k<Math.ceil((double)newSentence.length()/16);k++) {
          if(counter<newSentence.length()){
            System.out.print(newSentence.charAt(counter));
            counter++;
          }else{
            System.out.print("?");
          }

        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
