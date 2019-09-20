import java.util.Scanner;
class Praktikum2Pokemon{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input Pokemon dan Elementnya : ");
    String pokemon1 = input.next();
    String pokemon1Element = input.next();
    System.out.print("Input Pokemon dan Elementnya : ");
    String pokemon2 = input.next();
    String pokemon2Element = input.next();
    Boolean draw = (pokemon1Element.equalsIgnoreCase(pokemon2Element));
    Boolean pokemon1Win =false;
    //Checks First pokemon
    if (pokemon1Element.equalsIgnoreCase("ground")){
      if (pokemon2Element.equalsIgnoreCase("fire")) {
        pokemon1Win = true;
      }else if (pokemon2Element.equalsIgnoreCase("electric")){
        pokemon1Win = true;
      }else{
        pokemon1Win = false;
      }
    }else if (pokemon1Element.equalsIgnoreCase("electric")) {
      if (pokemon2Element.equalsIgnoreCase("water")) {
        pokemon1Win = true;
      }else if (pokemon2Element.equalsIgnoreCase("ice")){
        pokemon1Win = true;
      }else{
        pokemon1Win = false;
      }
    }else if (pokemon1Element.equalsIgnoreCase("fire")){
      if (pokemon2Element.equalsIgnoreCase("ice")) {
        pokemon1Win = true;
      }else if (pokemon2Element.equalsIgnoreCase("electric")){
        pokemon1Win = true;
      }else{
        pokemon1Win = false;
      }
    }else if (pokemon1Element.equalsIgnoreCase("water")) {
      if (pokemon2Element.equalsIgnoreCase("fire")) {
        pokemon1Win = true;
      }else if (pokemon2Element.equalsIgnoreCase("ground")){
        pokemon1Win = true;
      }else{
        pokemon1Win = false;
      }
    }else if (pokemon1Element.equalsIgnoreCase("ice")) {
      if (pokemon2Element.equalsIgnoreCase("water")) {
        pokemon1Win = true;
      }else if (pokemon2Element.equalsIgnoreCase("ground")){
        pokemon1Win = true;
      }else{
        pokemon1Win= false;
      }
    }else if (pokemon1Element.equalsIgnoreCase("electric")) {
      if (pokemon2Element.equalsIgnoreCase("water")) {
        pokemon1Win = true;
      }else{
        pokemon1Win = false;
      }
    }
    //Checks 2nd Pokemon
    if (pokemon2Element.equalsIgnoreCase("ground")){
      if (pokemon1Element.equalsIgnoreCase("fire")) {
        pokemon1Win = false;
      }else if (pokemon1Element.equalsIgnoreCase("electric")){
        pokemon1Win = false;
      }else{
        pokemon1Win = true;
      }
    }else if (pokemon2Element.equalsIgnoreCase("electric")) {
      if (pokemon1Element.equalsIgnoreCase("water")) {
        pokemon1Win = false;
      }else if (pokemon1Element.equalsIgnoreCase("ice")){
        pokemon1Win = false;
      }else{
        pokemon1Win = true;
      }
    }else if (pokemon2Element.equalsIgnoreCase("fire")){
      if (pokemon1Element.equalsIgnoreCase("ice")) {
        pokemon1Win = false;
      }else if (pokemon1Element.equalsIgnoreCase("electric")){
        pokemon1Win = false;
      }else{
        pokemon1Win = true;
      }
    }else if (pokemon2Element.equalsIgnoreCase("water")) {
      if (pokemon1Element.equalsIgnoreCase("fire")) {
        pokemon1Win = false;
      }else if (pokemon1Element.equalsIgnoreCase("ground")){
        pokemon1Win = false;
      }else{
        pokemon1Win = true;
      }
    }else if (pokemon2Element.equalsIgnoreCase("ice")) {
      if (pokemon1Element.equalsIgnoreCase("water")) {
        pokemon1Win = false;
      }else if (pokemon1Element.equalsIgnoreCase("ground")){
        pokemon1Win = false;
      }else{
        pokemon1Win= true;
      }
    }else if (pokemon2Element.equalsIgnoreCase("electric")) {
      if (pokemon1Element.equalsIgnoreCase("water")) {
        pokemon1Win = false;
      }else{
        pokemon1Win = true;
      }
    }
    if(draw){
      System.out.println("draw");
    }else{
      if(pokemon1Win){
        System.out.printf("%s Won!\n",pokemon1);
      }else{
        System.out.printf("%s Won!\n",pokemon2);
      }
    }
  }
}
