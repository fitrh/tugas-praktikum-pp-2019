import java.util.Scanner;

class Modul2String {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        String sentence = sl.nextLine();
        String newsentence = "";

        for (int i = 0; i < sentence.length(); i++) {
            if (i % 2 == 0) {
                newsentence += sentence.charAt(i);
            } else {
                newsentence += sentence.codePointAt(i);
            }
        }
        System.out.println(newsentence);
        int x = newsentence.length() % 16 == 0 ? newsentence.length() / 16 : newsentence.length() / 16 + 1;

        int index = 0;
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < x; j++) {
                if (index < newsentence.length()) {
                    System.out.print(newsentence.charAt(index));
                    index++;
                } else {
                    System.out.print("?");
                }
            }
            System.out.print(" ");
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}