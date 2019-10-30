import java.util.Scanner;
class GetFPB{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nilai1 = sc.nextInt();
        int nilai2 = sc.nextInt();
        sc.close();

        GetFPB find = new GetFPB();
        System.out.println(find.cariFPB(nilai1, nilai2));
    }

    public int cariFPB(int nilai1, int nilai2) {
        int min = nilai1 < nilai2 ? nilai1 : nilai2;
        for (int i = min; i > 0; i--) {
            if (nilai1 % i == 0 && nilai2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
    // for (int i = nilai1; i > 0; i--) {
    //     if (nilai1 % i == 0) {
    //         System.out.println("fpb-1 " + i);
    //     }
    // }

    // for (int j = nilai2; j > 0; j--) {
    //     if (nilai2 % j == 0) {
    //         System.out.println("fpb-2 " + j);
    //     }
    //  }
    return nilai2 != 0 ? getFPB(nilai2, nilai1 % nilai2):nilai1; 
}

