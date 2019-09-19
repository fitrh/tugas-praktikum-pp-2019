import java.util.Scanner;
class Praktikum2Numbers{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int odd=0;
    int even=0;
    int positive=0;
    int negative=0;
    System.out.println("Input 5 Integer!");
    try{
    for(int i=0;i<5;i++){
      int value = input.nextInt();
      if(value%2==0){
        even++;
        if (value>0){
          positive++;
        }else if (value<0){
          negative++;
        }
      }else{
        odd ++;
        if (value>0){
          positive++;
        }else if (value<0){
          negative++;
        }
      }
    }
    System.out.printf("%d Angka Genap\n",even);
    System.out.printf("%d Angka Ganjil\n",odd);
    System.out.printf("%d Angka Positif\n",positive);
    System.out.printf("%d Angka Negatif\n",negative);
    }catch(Exception e){
      System.out.println("Inputan Tidak Valid");
    }

  }
}
