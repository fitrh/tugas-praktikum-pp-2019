import java.util.Scanner;
class Latihan4{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sibi, limpu, duapuluh, sepuluh, lima, dua, satu, sisa;
        
        sibi = a / 100000;
        sisa = a % 100000;
        limpu = sisa / 50000;
        sisa = sisa % 50000;
        duapuluh = sisa / 20000;
        sisa = sisa % 20000;
        sepuluh = sisa / 10000;
        sisa = sisa % 10000;
        lima = sisa / 5000;
        sisa = sisa % 5000;
        dua = sisa / 2000;
        sisa = sisa % 2000;
        satu = sisa / 1000;
        System.out.println("Jumlah uang Rp. 100.000 = " + sibi);
        System.out.println("Jumlah uang Rp. 50.000 = " + limpu);
        System.out.println("Jumlah uang Rp. 20.000 = " + duapuluh);
        System.out.println("Jumlah uang Rp. 10.000 = " + sepuluh);
        System.out.println("Jumlah uang Rp. 5.000 = " + lima);
        System.out.println("Jumlah uang Rp. 2.000 = " + dua);
        System.out.println("Jumlah uang Rp. 1.000 = " + satu); 

    }
}