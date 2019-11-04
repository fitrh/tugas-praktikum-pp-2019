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
    System.out.printf("\nBilangan yang saling relatif prima dengan perulangan sebanyak %d! :\n",n);
    for (int i = 0 ;i<n ;i++ ) {
      for (int j = i; j<n ;j++ ) {
        int count =0;
        for (int k =2; k<=(arr[i]>arr[j]?arr[i]:arr[j]); k++){
          if (arr[i]%k==0 && arr[j]%k==0){
            count++;
          }
        }
        if(count==0){
          System.out.printf("%d %d\n",arr[i],arr[j]);
        }
      }
    }
  }
}
