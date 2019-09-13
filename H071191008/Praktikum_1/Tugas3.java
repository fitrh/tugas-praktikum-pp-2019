import java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        
        double a;
        double h;
        double u;
        double b;
        double x;
        double y;
        
        h = input.nextDouble();
        a = input.nextDouble();
        b = input.nextDouble();
        y = Math.tan(Math.toRadians(b)) * h;
        u = Math.tan(Math.toRadians(a)) * h;
        x = u - y;
        System.out.printf("%.1f",x);

    }

}
