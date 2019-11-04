import java.util.*;
class Tugas01_Final_H071191008{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        double[] arr = new double[in];
        double[] err = new double[in];
        double jlh = 0;
        for (int i = 0; i < arr.length; i++) {
            double n = input.nextDouble();
            arr[i] = n;
            jlh = jlh + arr[i];
        }
        double rata = jlh / arr.length;
        for (int i = 0; i < arr.length; i++) {
            err[i] = Math.sqrt(Math.pow(rata - arr[i],2));
        }
        System.out.println("NO\t|\tData\t|\tError");
        System.out.println("_________________________________________");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d\t",i + 1);
            System.out.print("| ");
            System.out.printf("%.2f\t",arr[i]);
            System.out.print("\t| ");
            System.out.printf("%.2f\n",err[i]);
        }

    }
}
