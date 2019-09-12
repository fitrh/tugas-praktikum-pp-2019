import java.util.Scanner;
class TugasPraktikum3{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Input ketinggian (h) --> ");
        int h = sc.nextInt();
        System.out.print("Input sudut elevasi belakang kapal --> ");
        int a = sc.nextInt();
        System.out.print("Input sudut elevasi depan kapal --> ");
        int b = sc.nextInt(); 

        float deg1 = (float) Math.tan(Math.toRadians(a)) * h;
        float deg2 = (float) Math.tan(Math.toRadians(b)) * h;
        float result = deg2 - deg1;
        System.out.printf("Panjang kapan = %.1f meter", result);


    }
}