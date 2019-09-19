import java.util.Scanner;
public class Tugas1 {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int x;
    int y;
    double z;
    x = input.nextInt();
    y = input.nextInt();
    z = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));

    if (z <= 25){
        System.out.println("Dalam Lingkaran A");
    }else if(z <= 144){
        System.out.println("Dalam Lingkaran B");
    }else if(z <= 400){
        System.out.println("Dalam Lingkaran C");
    }else {
        System.out.println("Diluar Lingkaran A,B,C");
    }

    }
}
