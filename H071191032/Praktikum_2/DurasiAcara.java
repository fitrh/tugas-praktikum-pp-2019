import java.util.Scanner;
class DurasiAcara{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Acara dimulai :");
        int h1 = sc.nextInt();
        int m1 = sc.nextInt();
        System.out.println("Acara berakhir :");
        int h2 = sc.nextInt();
        int m2 = sc.nextInt();
        int dur, hour, minute;

        if ( h1 >= 0 && h2 >= 0 && m1 >= 0 && m2 >= 0 ){
            if ( h2 > h1 ){
                h2 = h2 * 60 + m2;
                h1 = h1 * 60 + m1;
                dur = h2 - h1;
            } else{
                h2 = (h2 + 24) * 60 + m2;
                h1 = h1 * 60 + m1;
                dur = h2 - h1;
            }
        } else {
            dur = 0;
        }
        hour = dur / 60;
        minute = dur % 60;
        System.out.printf("%02d : %02d", hour, minute);
    
    }
}