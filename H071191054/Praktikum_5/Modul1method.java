import java.util.Scanner;

class Modul1Method {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int x = sl.nextInt();
        int y = sl.nextInt();
        int z = sl.nextInt();
        sl.close();
        Modul1Method find = new Modul1Method();
        System.out.println(find.getfpb(x, y, z));
    }

    public int getfpb(int a, int b, int c) {
        int min = a < b && a < c ? a : b < a && b < c ? b : c;
        for (int i = min; i > 0; i--) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                return i;
            }
        }
        return 1;
    }

}