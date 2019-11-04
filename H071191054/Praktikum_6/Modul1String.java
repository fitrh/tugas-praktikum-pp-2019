import java.util.Scanner;

class Modul1String {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        String sentence = sl.nextLine();
        // System.out.printf("#%s%s%s%s", hexa(sentence), palindrom(sentence),
        // octal(sentence), symbol(sentence));
        System.out.println(replace(sentence));
        System.out.println(hexa(sentence));
        System.out.println(palindrom(sentence));
    }

    public static String replace(String sentence) {
        String replace = sentence.replace(" ", "").toUpperCase();
        return replace;
    }

    public static String hexa(String replace) {
        int half = replace.length() / 2;
        String hexa = "";
        for (int i = 0; i < half; i++) {
            hexa += replace.charAt(i);
        }
        return hexa;
    }

    public static String palindrom(String hexa) {
        String palindrom = "";
        for (int i = hexa.length() - 2; i >= 0; i--) {
            palindrom += hexa;
        }
        return palindrom;
    }

    public static String combine(String hexa, String palindrom) {
        String combine = hexa + palindrom;
        return combine;
    }
}