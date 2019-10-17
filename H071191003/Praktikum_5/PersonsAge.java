import java.util.Scanner;
class PersonsAge{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input umur orang dalam hari : ");
    int days = input.nextInt();
    System.out.println(myYear(days) + " tahun");
    System.out.println(myMonth(days) + " bulan");
    System.out.println(myDay(days) + " hari");
  }
  static int myDay(int days){
    days %= 365;
    days %= 30;
    return days;
  }
  static int myMonth(int days){
    days %= 365;
    int months = days/30;
    return months;
  }
  static int myYear(int days){
    int years = days/365;
    return years;
  }
}
