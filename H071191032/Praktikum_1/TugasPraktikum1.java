import java.util.Scanner;
class TugasPraktikum1{
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Waktu yang ditempuh --> ");
        int a = sc.nextInt();
        System.out.print("Kecepatan rata - rata --> ");
        int b = sc.nextInt();
        double c =  (double) (a * b)/14;
        System.out.printf("Bensin yang digunakan : %.3f L", c); 

    }
}