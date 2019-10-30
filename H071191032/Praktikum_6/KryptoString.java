import java.util.Scanner;

class KryptoString{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String password = sc.nextLine();
        String leftKrypto = "";
        String rightKrypto = "";
        String afterRight = "";
        String afterLeft = "";
        
        //bagi dua String password menjadi bagian kiri dan bagian kanan
        if (password.length() % 2 == 1){
            for (int i = 0; i <= password.length()/2; i++){
                leftKrypto += password.charAt(i);
            }
            for (int i = (password.length()/2) + 1 ; i < password.length(); i++) {
                rightKrypto += password.charAt(i);
            }
        } else {
            for (int i = 0; i < password.length()/2; i++) {
                leftKrypto += password.charAt(i);
            }
            for (int i = (password.length()/2); i < password.length(); i++) {
                rightKrypto += password.charAt(i);
            }
        }

        //print bagian kanan
        for(int i = rightKrypto.length() - 1; i >= 0; i--) {
            afterRight += rightKrypto.charAt(i);
        }

        //print bagian kiri
        for (int i = 0; i < leftKrypto.length(); i++){
            char n = leftKrypto.charAt(i);
            int numAscii = (int) n + 3;
            char ascii = (char) numAscii;
            afterLeft += ascii;
        }

        System.out.print(afterRight.toUpperCase());
        System.out.print(afterLeft.toUpperCase());

        // char a = leftKrypto.charAt(0);
        // int  b = (int) a + 3;
        // System.out.println(b);
        
        // char asc = (char) b;
        // System.out.println(asc);
    }
}