import java.util.Scanner;
class Praktikum2Shapes{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int base; //Base works as a base or length
    int base2;
    int height;
    int width;
    float result;
    int radius;
    System.out.println("** Menu **");
    System.out.println("1. Mencari Luas bangun Datar");
    System.out.println("2. Mencari Volume Bangun Ruang\n");
    System.out.println("Input angka sesuai dengan Menu yang diinginkan : ");
    int menu = input.nextInt();
    switch(menu){
      case 1:
        System.out.println("** Pilih Bangun Datar **");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Trapesium");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Layang-Layang\n");
        System.out.println("Input angka sesuai dengan Menu yang diinginkan : ");
        break;
      case 2:
        System.out.println("** Pilih Bangun Ruang **");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga (Pyramid)");
        System.out.println("4. Sphere");
        System.out.println("5. Jajar Genjang");
        System.out.println("6. Trapesium");
        System.out.println("7. Belah Ketupat");
        System.out.println("8. Layang-Layang\n");
        System.out.println("Input angka sesuai dengan Menu yang diinginkan : ");
        break;
    }

    int shape = input.nextInt();
    switch(menu){
      case 1 :
        switch(shape){
          case 1:
            System.out.print("Input sides... ");
            base = input.nextInt();
            result = ((float)(base*base));
            System.out.printf("Luas Persegi = %.1f\n",result);
            break;
          case 2:
            System.out.print("Input alas... ");
            base = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)(base * height);
            System.out.printf("Luas Persegi Panjang = %.1f\n",result);
            break;
          case 3:
            System.out.print("Input alas... ");
            base = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)((base * height)/2.0);
            System.out.printf("Luas Segitiga = %.1f\n",result);
            break;
          case 4:
            System.out.print("Input radius... ");
            radius = input.nextInt();
            result = (float)(Math.PI*Math.pow(radius,2));
            System.out.printf("Luas Lingkaran = %.1f\n",result);
            break;
          case 5:
            System.out.print("Input alas... ");
            base = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)(base*height);
            System.out.printf("Luas Jajar Genjang = %.1f\n",result);
            break;
          case 6:
            System.out.print("Input alas bawah... ");
            base = input.nextInt();
            System.out.print("Input alas atas... ");
            base2 = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)(((base + base2)*height)/2.0);
            System.out.printf("Luas Trapesium = %.1f\n",result);
            break;
          case 7:
            System.out.print("Input panjang horizontal yang memotong titik tengah belah ketupat... ");
            base = input.nextInt();
            System.out.print("Input panjang vertikal yang memotong titik tengah belah ketupat... ");
            base2 = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)((base*height)/2.0);
            System.out.printf("Luas Belah Ketupat = %.1f\n",result);
            break;
          case 8:
            System.out.print("Input panjang horizontal yang memotong titik tengah belah ketupat... ");
            base = input.nextInt();
            System.out.print("Input panjang vertikal yang memotong titik tengah belah ketupat... ");
            base2 = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)((base*height)/2.0);
            System.out.printf("Luas Layang-Layang = %.1f\n",result);
            break;
          default:
            System.out.println("Invalid input!");
        }
        break;
      case 2 :
        switch(shape){
          case 1:
            System.out.print("Input sides... ");
            base = input.nextInt();
            result = ((float)(base*base*base));
            System.out.printf("Volume Bangun Ruang Persegi = %.1f\n",result);
            break;
          case 2:
            System.out.print("Input panjang... ");
            base = input.nextInt();
            System.out.print("Input lebar... ");
            width = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)(base * height * width);
            System.out.printf("Volume Bangun Ruang Persegi Panjang = %.1f\n",result);
            break;
          case 3:
            System.out.print("Input panjang... ");
            base = input.nextInt();
            System.out.print("Input lebar... ");
            width = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)((base * height* width)/3);
            System.out.printf("Volume Bangun Ruang Segitiga (Alas Persegi) = %.1f\n",result);
            break;
          case 4:
            System.out.print("Input radius... ");
            radius = input.nextInt();
            result = (float)((((4)*(Math.PI*Math.pow(radius,3))))/3.0);
            System.out.printf("Volume Sphere = %.1f\n",result);
            break;
          case 5:
            System.out.print("Input panjang... ");
            base = input.nextInt();
            System.out.print("Input lebar... ");
            width = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)(base*height);
            System.out.printf("Volume Bangun Ruang Jajar Genjang = %.1f\n",result);
            break;
          case 6:
            System.out.print("Input panjang bawah... ");
            base = input.nextInt();
            System.out.print("Input panjang atas... ");
            base2 = input.nextInt();
            System.out.print("Input Lebar");
            width = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)(((base + base2)*height*width)/2.0);
            System.out.printf("Volume Bangun Ruang Trapesium = %.1f\n",result);
            break;
          case 7:
            System.out.print("Input panjang horizontal yang memotong titik tengah belah ketupat... ");
            base = input.nextInt();
            System.out.print("Input panjang vertikal yang memotong titik tengah belah ketupat... ");
            base2 = input.nextInt();
            System.out.print("Input Lebar");
            width = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)((base*height*width)/2.0);
            System.out.printf("Volume Bangun Ruang Belah Ketupat = %.1f\n",result);
            break;
          case 8:
            System.out.print("Input panjang horizontal yang memotong titik tengah belah ketupat... ");
            base = input.nextInt();
            System.out.print("Input panjang vertikal yang memotong titik tengah belah ketupat... ");
            base2 = input.nextInt();
            System.out.print("Input Lebar");
            width = input.nextInt();
            System.out.print("Input tinggi... ");
            height = input.nextInt();
            result = (float)((base*height*width)/2.0);
            System.out.printf("Volume Bangun Ruang Layang-Layang = %.1f\n",result);
            break;
          default:
            System.out.println("Invalid input!");
            break;
          }
        break;
      default:
        System.out.println("Invalid input!");
        break;
    }
  }
}
