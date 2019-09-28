import java.util.Scanner;
class DeretFibonacci{
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int fn1 = 0;
        int fn2 = 1;

        for ( int i = 0; i < n ; i++){
            System.out.print(fn1 + " ");
            int fn = fn1 + fn2;
            fn2 = fn1;
            fn1 = fn;
        }
    }
}