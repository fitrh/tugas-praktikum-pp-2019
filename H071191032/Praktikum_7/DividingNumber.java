import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class DividingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();

        List<Integer> numbers = new ArrayList<>();
        String divide = "";
        int get = 0;
        for (int i = start; i <= end; i++) {
            if (i > -10 && i < 10) {
                numbers.add(i);
            } else {
                divide += Math.abs(i);
                for (int j = 0; j < divide.length(); j++) {
                    int[] part = new int [divide.length()];
                    part[j] += Integer.parseInt(String.valueOf(divide.charAt(j)));
                    if (part[j] != 0 && i % part[j] == 0) {
                        get++;
                    }
                }  
                if (get == divide.length()) {
                    numbers.add(i);
                }
                get = 0;   
                divide = "";
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(i == 0 ? "[" :  "");
            System.out.print(numbers.get(i));
            System.out.print(i < numbers.size() - 1 ? ", " : "");
            System.out.print(i == numbers.size() - 1 ? "]" : "");
        }
    }
}