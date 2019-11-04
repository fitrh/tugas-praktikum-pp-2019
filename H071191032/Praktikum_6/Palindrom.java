import java.util.Scanner;
class Palindrom{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int  n = sc.nextInt();
        int palindrom = 0;
        String[] words = new String[n];
        for (int  i = 0; i < n; i++){
            words[i] = sc.next();
        }

        for (int i = 0; i < words.length; i++){
            for (int j = 0, k = words[i].length() - 1; j < words[i].length() & k >= 0; j++, k--){
                if (words[i].charAt(j) == words[i].charAt(k)){
                    palindrom++;
                    break;
                }
            }
        }

        System.out.println(palindrom);
    }
}