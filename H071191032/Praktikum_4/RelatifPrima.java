 import java.util.Scanner;
class RelatifPrima{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int panjang = sc.nextInt();
        int[] array = new int[panjang];
        
        for ( int i = 0; i < array.length; i++){
            array[i] =  sc.nextInt();
        }

        int i, j, n = panjang - 1;
        for ( i = 0; i < array.length; i++) {
            for ( j = 1 + i; j <= n; j++) {                                                                                       
                if (array[i] % array[j] != 0 && array[j] % array[i] !=0){
                     System.out.println(array[i]+" "+array[j]);
                }
            }
        }


    }
}