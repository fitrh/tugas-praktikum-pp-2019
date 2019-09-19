import java.util.Scanner;
class Kartesius{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Input nilai x --> ");
        int x = in.nextInt();
        System.out.print("Input nilai y --> ");
        int y = in.nextInt();
        if ( x < 0 && y > 0){
            if ( x + y == 0){
                System.out.println("Terletak pada garis -x = y");
            } else if ( (x + y) < 0){
                System.out.printf("Titik (%d,%d) berada pada kuadran 1", x, y);
            } else{
                System.out.printf("Titik (%d,%d) berada pada kuadran 2", x, y);
            }
        } else if ( x > 0 && y > 0){
            if ( ( x - y ) == 0){
                System.out.println("Terletak pada garis x = y");
            } else if ( (x - y) < 0){
                System.out.printf("Titik (%d,%d) berada pada kuadran 3", x, y);
            } else {
                System.out.printf("Titik (%d,%d) berada pada kuadran 4", x, y);
            }
        } else if ( x > 0 && y < 0){
            if ( ( x + y ) == 0){
                System.out.println("Terletak pada garis x = -y");
            } else if ( ( x + y ) > 0 ){
                System.out.printf("Titik (%d,%d) berada pada kuadran 5", x, y);
            } else{
                System.out.printf("Titik (%d,%d) berada pada kuadran 6", x, y);
            }
        } else if ( x < 0 && y < 0 ){
            if ( ( x - y ) == 0){
                System.out.println("Terletak pada garis -x = -y");
            } else if ( ( x - y ) > 0 ){
                System.out.printf("Titik (%d,%d) berada pada kuadran 7", x, y);
            } else{
                System.out.printf("Titik (%d,%d) berada pada kuadran 8", x, y);
            }
        }
    }
}