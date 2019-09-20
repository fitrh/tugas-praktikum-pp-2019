import java.util.Scanner;
class Praktikum2EventDuration{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Input waktu mulainya acara (hh mm)!");
    int h1 = input.nextInt(); //Starting Hour
    int m1 = input.nextInt(); //Starting Minute
    System.out.println("Input waktu selesainya acara (hh mm)!");
    int h2 = input.nextInt(); //Starting Hour
    int m2 = input.nextInt(); //Starting Minute
    int hDuration;
    int mDuration;
    if(h2<h1){
      h2 += 24;
    } else if (h2 == h1 && m2 == m1){
      h2 += 24;
    }
    m1 += h1*60;
    m2 += h2 *60;
    hDuration = (m2 - m1)/60;
    mDuration = (m2 - m1)%60;
    System.out.printf("%02d:%02d\n",hDuration,mDuration);
  }
}
