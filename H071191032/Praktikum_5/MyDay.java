import java.util.Scanner;
class MyDay{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int umur = sc.nextInt(); 
        sc.close();

        if ( umur < 365) {
            System.out.println("Umur anda belum sampai 1 tahun :(");
        } else {
            myDays(umur);
        }
    }
    
    public static void myDays(int umur) {
        int year, month, day;  
        year = umur / 365;
        umur %= 365;
        month = umur / 30;
        day = umur % 30;
        
        System.out.println(year + " tahun");
        System.out.println(month + " bulan");
        System.out.println(day + " hari");
    }
}