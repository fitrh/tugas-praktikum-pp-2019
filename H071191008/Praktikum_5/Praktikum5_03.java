import java.util.Scanner;
class Praktikum5_03{
  public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    int hari=scan.nextInt();
    myDay(hari);
  }
  public static int myDay(int hari){
    int tahun=0;
    int bulan=0;
    tahun = hari/360;
    hari = hari%360;
    bulan = hari/30;
    hari = hari%30;
    System.out.printf("%d tahun %d bulan %d hari", tahun,bulan,hari);
    return hari;
  }
}
