// Muammar Ahlan Abimanyu
// H071191032

import java.util.Scanner;
class Latihan2{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Berat badan ideal-----");
        System.out.print("Nama : ");
        String name = sc.nextLine();
        System.out.print("Tinggi badan : ");
        float tinggi = sc.nextInt();
        System.out.print("Berat badan : ");
        float berat = sc.nextInt();
        System.out.print("Presentasi L -> 10, P -> 15 :");
        float jk = sc.nextInt();
        
        float persen = jk / 100;
        float ideal1 = (tinggi - 100);
        float ideal2 = ideal1 * persen ;
        float ideall = ideal1 - ideal2;
        float target = ideall - berat;

        System.out.println("-----INFORMASI-----");
        System.out.printf("Nama : %.1s \n", name);
        System.out.printf("Tinggi badan : %.1f \n", tinggi);
        System.out.printf("Berat badan anda : %.1f kg \n", berat);
        System.out.printf("Berat badan ideal anda : %.1f kg \n", ideall );
        System.out.printf("Target ideal anda : %.1f kg", target );
    }
}