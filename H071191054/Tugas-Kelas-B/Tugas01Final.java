import java.util.Scanner;

class Tugas01Final {
    public static void main(String[] args) {
        Scanner sl = new Scanner(System.in);
        int n = sl.nextInt();
        int[] arr = new int[n];
        double sum = 0;
        double error = 0;

        System.out.print("Input data = ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sl.nextInt();
            sum += arr[i];
        }
        double avg = sum / n;
        System.out.println("Rata-rata = " + avg);

        System.out.println("+===============================================+");
        System.out.println("|\tNo\t|\tData\t|\tError\t|");
        System.out.println("+===============================================+");

        for (int i = 0; i < arr.length; i++) {
            // System.out.printf("Error ke %d = ", i);
            error = Math.sqrt(Math.pow(avg - arr[i], 2));
            // System.out.println(error);
            System.out.printf("|\t%d\t|\t%d\t|\t%.3f\t|\n", (i + 1), arr[i], error);
        }
        System.out.println("+===============================================+");
    }
}