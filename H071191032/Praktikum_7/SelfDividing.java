import java.util.*;
class SelfDividing {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        sc.close();
        List<Integer> numbers = new ArrayList<>();
        
        for (int i = start; (start > end) ? i >= end : i <= end; i += (start > end) ? -1 : 1) {
            int n = Math.abs(i);
            boolean isDivided = true;
            while (n > 0) {
                int check = n % 10;
                n /= 10;
                if (check == 0 || i % check != 0) {
                    isDivided = false;
                    break;
                }
            }
            if (isDivided && i != 0) {
                numbers.add(i);
            }
        }

        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(i == 0 ? "[" : ", ");
            System.out.print(numbers.get(i));
            System.out.print(i == numbers.size() - 1 ? "]" : "");
        }
    }
}