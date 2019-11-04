import java.util.Scanner;
public class ArrayTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int[] arrayData = new int[10];
        double[] error = new double[10];
        int sumData = 0;
        double avgData;
        for (int i = 0; i < 10; i++) {
            arrayData[i] = sc.nextInt();
            sumData += arrayData[i];
        }
        avgData = (double) sumData / 10;

        System.out.println("-------------------------");
        System.out.println("|No.\t|Data\t|Error\t|");
        System.out.println("-------------------------");
        for ( int j = 0, k = 1; j < 10; j++, k++) {
            double pangkat = Math.pow(avgData - arrayData[j], 2);
            error[j] = Math.sqrt(pangkat);
            System.out.printf("|%d\t|%d\t|%.3f\t|\n",k,arrayData[j], error[j]);
        }
        System.out.println("-------------------------");
            
        
    }
}