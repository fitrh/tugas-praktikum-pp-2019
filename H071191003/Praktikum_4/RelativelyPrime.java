import java.util.Scanner;
class RelativelyPrime{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input banyak bilangan yang ingin diinput!");
    int n = input.nextInt();
    int arr[] = new int[n];
    System.out.printf("Input %d bilangan! \n", n);
    for (int i =0 ;  i<n  ; i++){
      arr[i] = input.nextInt();
    }
    int iterations=0;
    int max;
    int nMinusOneFactorial = 1;
    for (int i=1; i<n; i++){
      nMinusOneFactorial *= i;
    }
    System.out.println("\nBilangan yang saling relatif prima dengan perulangan sebanyak " + nMinusOneFactorial + " kali :");
    for (int i = 0 ;i<n ;i++ ) {
      for (int j = 0+1; j<n ;j++ ) {
        int count=0;
        if (arr[i]>=arr[j]){
          max = arr[i];
        }else{
          max = arr[j];
        }
        for (int k =2; k<=max; k++){
          if (arr[i]%k==0 && arr[j]%k==0){
            count++;
          }
        }
        if(count==0){
          System.out.printf("%d %d\n",arr[i],arr[j]);
        }
        iterations++;
        if(iterations==nMinusOneFactorial){
          return;
        }
      }
    }
  }
}
