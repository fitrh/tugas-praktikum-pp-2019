//Tugas Final 01

import java.util.Scanner;
/**
 * Array
 */
public class Array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int [] arr = new int[10];
        int sum = 0;
        double[] anError = new double[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
            sum += arr[i];
        }
        double avg = (double)sum/10;
        System.out.println("-------------------------------------------------");
        System.out.println("|\tNo\t|\tData\t|\tError\t|");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < arr.length; i++) {
            anError[i] = Math.sqrt(Math.pow(avg - arr[i], 2));
            System.out.printf("|\t%s\t|\t%d\t|\t%.2f\t|\n", (i+1) < 10 ? "0"+(i+1) : (i+1), arr[i], anError[i]);
        }
        input.close();
    }
}