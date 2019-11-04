import java.util.Scanner;
class MatriksManipulation{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String inputan = sc.nextLine(); //min 16 karakter
        String newInputan = "";

        for (int i = 0; i < inputan.length(); i++) {
            newInputan += i%2==0 ? String.valueOf(inputan.charAt(i)) : String.valueOf(inputan.codePointAt(i));
        }
        // System.out.println(newInputan);
        int box = newInputan.length() % 16 == 0 ? newInputan.length()/ 16 : newInputan.length()/16 +1;

        int index = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < box; j++) {
                if (index < newInputan.length()) {
                    System.out.print(newInputan.charAt(index));
                    index++;
                } else {
                    System.out.print("?");
                }
            }
            System.out.print(" ");
            if ((i+1) % 4 == 0) {
                System.out.println();
            }
        }           
    }
}