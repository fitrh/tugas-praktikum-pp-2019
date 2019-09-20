import java.util.Scanner;
/**
 * Tugas02
 */
public class Tugas02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int startHour = input.nextInt();
        int startMin = input.nextInt();
        int endHour = input.nextInt();
        int endMin = input.nextInt();
        int hour = 0;
        int minute = 0;
        if (startHour > endHour) {
            endHour += 24;
        }
        if (startMin > endMin){
            minute = (endMin+60)-startMin;
            hour = endHour-(startHour+1);
            if (hour < 0) {
                hour += 24;
            }
        }
        if (startHour <= endHour && startMin <= endMin) {
            hour = endHour - startHour;
            minute = endMin - startMin;
        }
        if (startHour == startMin && endHour == endMin) {
            hour = 24;
            minute = 0;
        }
        System.out.printf("%02d:%02d\n",hour,minute);
        input.close();
    }
}