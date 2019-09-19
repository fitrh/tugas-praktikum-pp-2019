import java.util.Scanner;
class ass{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        try {

          int a;
          int b;
          int c;
          int d;
          int e;
          int genap = 0;
          int ganjil = 0;
          int positif = 0;
          int negatif = 0;

          a = in.nextInt();
          a = a%2 == 0 ? genap++ : ganjil++;
          a = a%2 == -1 ? positif++ : negatif++;

          b = in.nextInt();
          b = b%2 == 0 ? genap++ : ganjil++;
          b = b%2 == -1 ? positif++ : negatif++;

          c = in.nextInt();
          c = c%2 == 0 ? genap++ : ganjil++;
          c = c%2 == -1 ? positif++ : negatif++;

          d = in.nextInt();
          d = d%2 == 0 ? genap++ : ganjil++;
          d = d%2 == -1 ? positif++ : negatif++;

          e = in.nextInt();
          e = e%2 == 0 ? genap++ : ganjil++;
          e = e%2 == -1 ? positif++ : negatif++;

          System.out.print("Jumlah Bilangan Genap = ");
          System.out.println(genap);
          System.out.print("Jumlah Bilangan Ganjil = ");
          System.out.println(ganjil);
          System.out.print("Jumlah Bilangan Positif = ");
          System.out.println(positif);
          System.out.print("Jumlah Bilangan Negatif = ");
          System.out.println(negatif);

        }
        catch (Exception salah) {
          System.out.print("Input Salah");
        }
    }

}
