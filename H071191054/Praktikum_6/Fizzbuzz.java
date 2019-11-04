import java.util.Scanner;

class Fizzbuzz {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        String word = sl.nextLine();
        int alphab = 0;
        int alphaf = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == 'f') {
                alphaf++;
            } else if (word.toLowerCase().charAt(i) == 'b') {
                alphab++;
            }
        }
        if (alphaf == 0 && alphab == 0) {
            System.out.println(word);
        } else {
            for (int i = 0; i < alphaf; i++) {
                System.out.print("fizz");
            }
            for (int i = 0; i < alphab; i++) {
                System.out.print("buzz");
            }
        }

    }
}