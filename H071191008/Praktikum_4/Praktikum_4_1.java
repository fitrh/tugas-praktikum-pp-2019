import java.util.Arrays;
class Praktikum_4_1{
    public static void main(String[] args) {
        char[] chars = {'A','B','C'};
        System.out.print("{");
        for (int i = 0; i < chars.length; i++) {
            System.out.printf("%d%s",(int)chars[i],i == chars.length - 1? "":",");
        }
        System.out.print("}");
    }
}
