import java.util.Scanner;
class VolleyBall{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Jumlah pemain : ");
    int numPlayers = input.nextInt();
    String player[] = new String[numPlayers];
    String data[] = {"Services \t: ","Block \t\t: ","Smash \t\t: "};
    int playerData[][][] = new int [numPlayers][2][3];
    for(int i = 0; i< numPlayers; i++){
      System.out.printf("Input nama pemain %d : ",i+1);
      player[i] = input.next();
      System.out.println("Input berapa kali dilakukan Service, Block, dan Smash : ");
      for(int j = 0; j<3;j++){
        playerData[i][0][j] = input.nextInt();
      }
      System.out.println("Input berapa kali Service, Block, dan Smash berhasil : ");
      for(int j = 0; j<3;j++ ){
        playerData[i][1][j] = input.nextInt();
      }
    }
    int average[][] = new int[2][3];
    // [0][i] = rata-rata percobaan
    // [1][i] = rata=rata sukses
    for(int i = 0; i<numPlayers; i++){
      for(int j=0; j<3;j++){
        average[0][j] += playerData[i][0][j];
        average[1][j] += playerData[i][1][j];
      }
    }
    for(int i = 0; i<3; i++){
      System.out.print(data[i]);
      if (average[0][i]<average[1][i]){
        System.out.println("Terjadi salah input!");
        continue;
      }
      System.out.printf("%.02f%%\n",(float)(average[1][i]*100)/average[0][i]);
    }

  }
}
