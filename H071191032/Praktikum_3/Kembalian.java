import java.util.Scanner;
class Kembalian{
    public static void main (String args []){
        Scanner input = new Scanner (System.in);
        int price = input.nextInt();
        int money = input.nextInt();
        int change = money - price;
        int hundred = 0;
        int fifty = 0;
        int twenty = 0;
        int ten = 0;
        int five = 0;
        int two = 0;
        int one = 0;
        boolean condition = true;

        if ( money > price){
            while ( condition ){
                if ( change >= 100000){
                    change -= 100000;
                    hundred++;
                } else if ( change >= 50000){
                    change -= 50000;
                    fifty++;
                } else if ( change >= 20000){
                    change -= 20000;
                    twenty++;
                } else if ( change >= 10000){
                    change -= 10000;
                    ten++;
                } else if ( change >= 5000){
                    change -= 5000;
                    five++;
                } else if ( change >= 2000){
                    change -= 2000;
                    two++;
                } else if (change >= 1000){
                    change = 1000;
                    one++;
                } else if ( change == 0 || change < 1000){
                    condition = false;
                }
                System.out.printf("%d uang Rp. 100.000\n",hundred);
                System.out.printf("%d uang Rp. 50.000\n",fifty);
                System.out.printf("%d uang Rp. 20.000\n",twenty);
                System.out.printf("%d uang Rp. 10.000\n",ten);
                System.out.printf("%d uang Rp. 5.000\n",five);
                System.out.printf("%d uang Rp. 2.000\n",two);
                System.out.printf("%d uang Rp. 1.000",one);
            }
        } else {
            System.out.println("Uang anda kurang");
        }

    }
}