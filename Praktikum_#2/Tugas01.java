import java.util.Scanner;
/**
 * Tugas01
 */
public class Tugas01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        if (x<0 && y>0){
            if(x+y<0){
                System.out.println("Titik ("+x+","+y+") berada pada kuadran 1");
            } else if (x+y>0){
                System.out.println("Titik ("+x+","+y+") berada pada kuadran 2");
            } else {
                System.out.println("terletak pada garis -x = y");
            }
        } else if (x>0 && y>0){
            if(x-y<0){
                System.out.println("Titik ("+x+","+y+") berada pada kuadran 3");
            } else if (x-y>0){
                System.out.println("Titik ("+x+","+y+") berada pada kuadran 4");
            } else {
                System.out.println("terletak pada garis x = y");
            }
        } else if (x>0 && y<0){
            if(x+y<0){
                System.out.println("Titik ("+x+","+y+") berada pada kuadran 5");
            } else if (x+y>0){
                System.out.println("Titik ("+x+","+y+") berada pada kuadran 6");
            } else {
                System.out.println("terletak pada garis x = -y");
            }
        } else if (x<0 && y<0) {
            if(x-y<0){
                System.out.println("Titik ("+x+","+y+") berada pada kuadran 7");
            } else if (x-y>0){
                System.out.println("Titik ("+x+","+y+") berada pada kuadran 8");
            } else {
                System.out.println("terletak pada garis -x = -y");
            }
        }
    }
}