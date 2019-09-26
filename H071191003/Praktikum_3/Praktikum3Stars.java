class Praktikum3Stars{
  public static void main(String[] args) {
    int numberOfStars = 1;
    int sum =0;
    for (int starRow = 0; starRow<9; starRow++){
      for (int starCollumn = 0; starCollumn<sum; starCollumn++){
        System.out.print("*");
      }
      sum +=starRow;
      System.out.println();
    }
  }
}
