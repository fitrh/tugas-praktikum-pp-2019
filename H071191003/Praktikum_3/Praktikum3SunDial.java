import java.util.Scanner;
class Praktikum3SunDial{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input sudut yang ingin dikonversikan ke bentuk jam ");
    while(input.hasNextFloat()){
      float degree = (input.nextFloat())%360;
      float percent = degree/360;
      int second = (int)(((percent*86400)+21600 >86400) ? (percent*86400)-64800 : percent*86400 + 21600);
      int minute = second/60;
      second %=60;
      int hour = minute/60;
      minute %= 60;
      if (hour>=6 &&hour<12){
        System.out.println("Selamat Pagi");
      } else if (hour>=12 && hour<=16){
        System.out.println("Selamat Siang");
      } else if (hour>16 && hour<18){
        System.out.println("Selamat Sore");
      } else{
        System.out.println("Selamat Malam");
      }
      System.out.printf("%02d:%02d:%02d\n",hour,minute,second);
    }

  }
}
