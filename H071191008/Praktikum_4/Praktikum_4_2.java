import java.util.Arrays;
class Praktikum_4_2{
    public static void main(String[] args) {
        char[] a = {'t','a','u','f','i','q'};
        char[] b = {'g','o','e'};
        char c;
//sebelum
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.print("A <-> B\n");
//sesudah
        for (int i = 0; i < (a.length < b.length ? a.length:b.length); i++) {
            c = a[i];
            a[i] = b[i];
            b[i] = c;
        }
//hilangkan tanda"//" pada baris berikut jika ingin menggunakan "[]"
        // System.out.println(Arrays.toString(a));
        // System.out.println(Arrays.toString(b));


//hilangkan tanda"//" pada baris berikut jika ingin menggunakan "{}"
        // System.out.print("A = {");
        // for (int i = 0; i < a.length; i++) {
        //     System.out.printf("%s%s",a[i],i < a.length - 1? ",":"");
        // }
        // System.out.print("}\n");
        // System.out.print("B = {");
        // for (int i = 0; i < b.length; i++) {
        //     System.out.printf("%s%s",b[i],i < b.length - 1? ",":"");
        // }
        // System.out.print("}");
    }
}
