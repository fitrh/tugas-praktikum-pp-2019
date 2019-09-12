import java.util.Scanner;
/**
 * Tugas02
 */
public class Tugas02 {
    public static void main(String []args){
        int number, hours;
        int minutes = 0;
        int seconds = 0;
        
        Scanner input = new Scanner(System.in);
        
        number = input.nextInt();
        hours = number / 3600;
        number = number % 3600;
        minutes = number / 60;
        number = number % 60;
        seconds = number;
        System.out.printf("%d:%d:%d\n",hours,minutes,seconds);
    }
    
}