import java.util.Scanner;
class Praktikum2AnimalClassification{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input Filum...");
    String input1 = input.nextLine();
    System.out.print("Input Kelas...");
    String input2 = input.nextLine();
    System.out.print("Input Ordo...");
    String input3 = input.nextLine();
    Boolean valid = false;
    System.out.print("Animal : ");
    if(input1.equalsIgnoreCase("vertebrado")){
      if(input2.equalsIgnoreCase("ave")){
        if(input3.equalsIgnoreCase("carnivoro")){
          System.out.println("agula");
          valid = true;
        }else if(input3.equalsIgnoreCase("onivoro")){
          System.out.println("pomba");
          valid = true;
        }
      }else if (input2.equalsIgnoreCase("mamifero")){
        if(input3.equalsIgnoreCase("onivoro")){
          System.out.println("homem");
          valid = true;
        }else if(input3.equalsIgnoreCase("herbivoro")){
          System.out.println("vaca");
          valid = true;
        }
      }
    }else if(input1.equalsIgnoreCase("invertebrado")){
      if(input2.equalsIgnoreCase("inseto")){
        if(input3.equalsIgnoreCase("hematofago")){
          System.out.println("pulga");
          valid = true;
        }else if(input3.equalsIgnoreCase("herbivoro")){
          System.out.println("lagarta");
          valid = true;
        }
      }else if (input2.equalsIgnoreCase("anelideo")){
        if(input3.equalsIgnoreCase("hematofago")){
          System.out.println("sanguessuga");
          valid = true;
        }else if(input3.equalsIgnoreCase("onivoro")){
          System.out.println("minhoca");
          valid = true;
        }
      }
    }
    if(valid ==false){
      System.out.println("Input invalid!");
    }
  }
}
