import java.util.Scanner;
class NumberCount{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input the number of inputs:");
    int n = input.nextInt();
    int numbers[] = new int[n];
    System.out.println("Input "+n+" numbers");
    for (int i=0;i<n ;i++ ) {
        numbers[i] = input.nextInt();
    }
    //Code Bellow Sorts Numbers
    for(int i =0; i<n;i++){
      int number = Integer.MIN_VALUE;
      for(int j = i+1;j<n;j++){
        if ( numbers[i]>numbers[j] && (i != j) ){
          int memory = numbers[j];
          numbers[j] = numbers[i];
          numbers[i] = memory;
        }
      }
    }
    //
    int memory =Integer.MIN_VALUE;
    for(int i=0;i<n;i++){
      int count = 0;
      if(numbers[i]>memory){
        memory = numbers[i];
        for (int j=0;j<n;j++) {
          if(numbers[j]==memory){
            count++;
          }
        }
        System.out.printf("%d appears %d times\n",memory,count);
      }
    }

  }
}
