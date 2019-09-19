import java.util.Scanner;

class Bilangan {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        try {
            int ganjil = 0;
            int genap = 0;
            int positif = 0;
            int negatif = 0;
            System.out.print("Input bilangan");
            int a = sl.nextInt();
            int b = sl.nextInt();
            int c = sl.nextInt();
            int d = sl.nextInt();
            int e = sl.nextInt();

            if (a % 2 != 0) {
                if (a > 0) {
                    ganjil++;
                    positif++;
                } else if (a < 0) {
                    ganjil++;
                    negatif++;
                } else {
                    genap++;
                }
            } else {
                if (a > 0) {
                    genap++;
                    positif++;
                } else if (a < 0) {
                    genap++;
                    negatif++;
                } else {
                    genap++;
                }
            }
            if (b % 2 != 0) {
                if (b > 0) {
                    ganjil++;
                    positif++;
                } else if (b < 0) {
                    ganjil++;
                    negatif++;
                } else {
                    genap++;
                }
            } else {
                if (b > 0) {
                    genap++;
                    positif++;
                } else if (b < 0) {
                    genap++;
                    negatif++;
                } else {
                    genap++;
                }
            }
            if (c % 2 != 0) {
                if (c > 0) {
                    ganjil++;
                    positif++;
                } else if (c < 0) {
                    ganjil++;
                    negatif++;
                } else {
                    genap++;
                }
            } else {
                if (c > 0) {
                    genap++;
                    positif++;
                } else if (c < 0) {
                    genap++;
                    negatif++;
                } else {
                    genap++;
                }
            }
            if (d % 2 != 0) {
                if (d > 0) {
                    ganjil++;
                    positif++;
                } else if (d < 0) {
                    ganjil++;
                    negatif++;
                } else {
                    genap++;
                }
            } else {
                if (d > 0) {
                    genap++;
                    positif++;
                } else if (d < 0) {
                    genap++;
                    negatif++;
                } else {
                    genap++;
                }
            }
            if (e % 2 != 0) {
                if (e > 0) {
                    ganjil++;
                    positif++;
                } else if (e < 0) {
                    ganjil++;
                    negatif++;
                } else {
                    genap++;
                }
            } else {
                if (e > 0) {
                    genap++;
                    positif++;
                } else if (e < 0) {
                    genap++;
                    negatif++;
                } else {
                    genap++;
                }
            }
            System.out.println(genap + " bilangan genap");
            System.out.println(ganjil + " bilangan ganjil");
            System.out.println(positif + " bilangan positif");
            System.out.println(negatif + " bilangan negatif");

        } catch (Exception e) {
            System.out.println("Inputan tidak valid");
        }
    }
}