import java.util.Scanner;
/**
 * Tugas05
 */
public class Tugas05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float angle;
        float hour = 360.0f/24.0f;
        while ((angle = input.nextFloat()) >= 0 && angle < 360) {
            if (angle >= 0 && angle < 90) {
                System.out.println("Selamat Pagi");
            } else if (angle >= 90 && angle < 180) {
                System.out.println("Selamat Siang");
            } else if (angle >= 180 && angle < 270) {
                System.out.println("Selamat Sore");
            } else {
                System.out.println("Selamat Malam");
            } 
            String time = "";
            float value = 6.0f + (1.0f/hour) * angle;
            int hours = (int)value;
            time += (hours < 10 ? "0"+hours : hours) + ":";
            int minutes = (int)(value*60)%60;
            time += (minutes < 10 ? "0"+minutes : minutes) + ":";
            int seconds = (int)((value*3600)%60)%60;
            time += seconds < 10 ? "0"+seconds : seconds;
            System.out.println(time);
        }
        input.close();
    }
}