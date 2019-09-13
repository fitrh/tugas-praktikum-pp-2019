import java.util.Scanner;
class Kapal {
    public static void main (String[] args){
        Scanner sl = new Scanner (System.in);

        // h = ketinggian menara
        // a = sudut elevasi pengamat terhadap ujung depan kapal
        // b = sudut elevasi pengamat terhadap ujung belakang kapal

        float h = sl.nextFloat();
        float a = sl.nextFloat();
        float b = sl.nextFloat();

        double suduta = Math.tan(Math.toRadians(a))*h;
        double sudutb = Math.tan(Math.toRadians(b))*h;
        double hasil = sudutb - suduta;
        System.out.println(hasil);
    }
}