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
    int input1 = input.nextInt();
    int input2 = input.nextInt();
    int input3 = input.nextInt();
    int input4 = input.nextInt();
    int input5 = input.nextInt();
    if (input1 % 2 ==0){
      odd++;
    }
    if (input1>0){
      positive++;
    }else if(input1<0){
      negative++;
    }
    if (input2 % 2 ==0){
      even++;
    }
    if (input2>0){
      positive++;
    }else if(input2<0){
      negative++;
    }
    if (input3 % 2 ==0){
      even++;
    }
    if (input3>0){
      positive++;
    }else if(input3<0){
      negative++;
    }
    if (input4 % 2 ==0){
      even++;
    }
    if (input4>0){
      positive++;
    }else if(input4<0){
      negative++;
    }
    if (input5 % 2 ==0){
      even++;
    }
    if (input5>0){
      positive++;
    }else if(input5<0){
      negative++;
    }
    odd = 5-even;
    System.out.printf("%d Angka even\n",even);
    System.out.printf("%d Angka odd\n",odd);
    System.out.printf("%d Angka Positif\n",positive);
    System.out.printf("%d Angka Negatif\n",negative);
    }catch(Exception e){
      System.out.println("Inputan Tidak Valid");
    }

  }
}
