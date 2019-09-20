import java.util.Scanner;
class Praktikum2Quadrant{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Input nilai x... ");
    int x = input.nextInt();
    System.out.print("Input nilai y... ");
    int y = input.nextInt();
    if(x<0 && y>0 && Math.abs(x)>y){
      System.out.printf("Titik (%d,%d) berada pada kuadran 1 \n",x,y);
    }else if(x<0 && y>0 && Math.abs(x)<Math.abs(y)){
      System.out.printf("Titik (%d,%d) berada pada kuadran 2\n",x,y);
    }else if(x>0 && y>0 && Math.abs(x)<Math.abs(y)){
      System.out.printf("Titik (%d,%d) berada pada kuadran 3\n",x,y);
    }else if(x>0 && y>0 && Math.abs(x)>Math.abs(y)){
      System.out.printf("Titik (%d,%d) berada pada kuadran 4\n",x,y);
    }else if(x>0 && y<0 && Math.abs(x)>Math.abs(y)){
      System.out.printf("Titik (%d,%d) berada pada kuadran 5\n",x,y);
    }else if(x>0 && y<0 && Math.abs(x)<Math.abs(y)){
      System.out.printf("Titik (%d,%d) berada pada kuadran 6\n",x,y);
    }else if(x<0 && y<0 && Math.abs(x)<Math.abs(y)){
      System.out.printf("Titik (%d,%d) berada pada kuadran 7\n",x,y);
    }else if(x<0 && y<0 && Math.abs(x)>Math.abs(y)){
      System.out.printf("Titik (%d,%d) berada pada kuadran 8\n",x,y);
    }else if(x==0 && y==0){
      System.out.printf("Titik (%d,%d) berada pada titik origin (0,0)\n",x,y);
    }else if(x==0 && y >0 || y< 0){
      System.out.printf("Titik (%d,%d) berada pada garis y\n",x,y);
    }else if(y==0 && x >0 || x< 0){
      System.out.printf("Titik (%d,%d) berada pada garis x\n",x,y);
    }else if(Math.abs(x) == Math.abs(y)){
      if(x<0 && y <0 || x>0 && y>0){
        System.out.printf("Titik (%d,%d) berada pada garis fungsi f(x) = y \n",x,y);
      }else{
        System.out.printf("Titik (%d,%d) berada pada garis fungsi f(x) = -y \n",x,y);
      }
    }
  }
}
