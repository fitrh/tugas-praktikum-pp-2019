import java.util.Scanner;
class Latihan3{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Input angka pertama --> ");
        int a = sc.nextInt();
        System.out.print("Input angka kedua --> ");
        int b = sc.nextInt(); 
    
        boolean c = a % b == 0;
        boolean d = b % a == 0;
        boolean e = c || d;
        System.out.printf("Apakah %d kelipatan dari %d ? %b",a,b,e );
    }
}