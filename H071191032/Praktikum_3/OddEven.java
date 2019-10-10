import java.util.Scanner;
class OddEven{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int x = input.nextInt();
        int y = input.nextInt();

        if ( x <= y){
            for (; x <= y; x++){
                if ( x > 0){
                    if ( x%2 == 0){
                        System.out.println(x + " genap positif");
                    } else {
                        System.out.println(x + " ganjil positif");
                    }
                } else if ( x < 0){
                    if ( x%2 == 0){
                        System.out.println(x + " genap negatif");
                    } else {
                        System.out.println(x + " ganjil negatif");
                    }
                } else if ( x == 0){
                    System.out.println(x + " nol");
                }
            }
        } else {
            for (; y <= x ; y++){
                if ( y > 0){
                    if ( y%2 == 0){
                        System.out.println(y + " genap positif");
                    } else {
                        System.out.println(y + " ganjil positif");
                    }
                } else if ( y < 0){
                    if ( y%2 == 0){
                        System.out.println(y + " genap negatif");
                    } else {
                        System.out.println(y + " ganjil negatif");
                    }
                } else if ( y == 0){
                    System.out.println(y + " nol");
                }
            }
        }
    }
}