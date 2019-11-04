import java.util.Arrays;
import java.util.Scanner;
class UniqueCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String code = sc.nextLine();    
        String codeNoSpace = code.replaceAll(" ","");

        //bagi dua string tanpa spasi
        String halfCode = "";
        for (int i = 0; i < codeNoSpace.length()/2; i++){
            halfCode += codeNoSpace.charAt(i);
        }

        //manipulasi halfcode menjadi palindrom
        String palindrom = "";
        for (int i = halfCode.length() - 2; i >= 0; i--) {
            palindrom += codeNoSpace.charAt(i);
        }
        String both = halfCode + palindrom; //kata palindrom

        //hexadecimal
        int hexa = code.length() * code.length(); 
        String hexadecimal = String.format("%x", hexa);

        //simbol ? atau !
        char symbol = hexadecimal.charAt(0);

        System.out.printf("#%s%s%o%c",hexadecimal, both.toUpperCase(), code.length(), symbol >= 'A' && symbol <= 'z' ? '?' : '!');
    }
}