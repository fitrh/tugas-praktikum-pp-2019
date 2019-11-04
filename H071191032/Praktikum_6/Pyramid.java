import java.util.Scanner;
class Pyramid{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        // for ( int i = 0; i < n; i++) {
        //     for ( int j = 0; j < i + 1; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<5;i++) {
            for(int j=0;j<5-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++) {
                System.out.print("* ");
            }
            System.out.println();  
        }
        
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}