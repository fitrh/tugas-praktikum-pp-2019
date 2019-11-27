import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class FavMovie {
    public static List<String> movielist = new ArrayList<String>();
    public static Map<String, String> moviemap = new HashMap<String, String>();
    public static Scanner sl = new Scanner(System.in);
    public static boolean check = true;

    public static void main(String[] args) {
        if (check) {
            System.out.println("\nList kosong. Silahkan tambahkan film");
            getAll();
        }

        String str = sl.nextLine();
        if (str.equals("a")) {
            add();
            getAll();
        } else if (str.equals("d")) {
            getDetail(sl.nextInt() - 1);
            getAll();
        } else if (str.equals("r")) {
            movielist.remove(sl.nextInt() - 1);
            getAll();
        } else if (str.equals("s")) {
            searchList();
            getAll();
        }
        check = false;
        main(args);
    }

    public static void getAll() {
        for (int i = 0; i < movielist.size(); i++) {
            System.out.println((i + 1) + "." + movielist.get(i));
        }
        System.out.println("(d)detail (s)search (a)add (r)remove");
    }

    public static void add() {
        System.out.print("Judul :");
        String title = sl.nextLine();
        movielist.add(title);
        System.out.print("Rilis :");
        String detail = sl.nextLine() + "@";
        System.out.print("Durasi :");
        detail += sl.nextLine() + "@";
        System.out.print("Genre :");
        detail += sl.nextLine() + "@";
        System.out.print("Sinopsis :");
        detail += sl.nextLine() + "@";
        System.out.print("Cast :");
        detail += sl.nextLine() + "@";
        moviemap.put(title, detail);
    }

    public static void getDetail(Integer i) {
        String title = movielist.get(i);
        String[] detail = moviemap.get(title).split("@");
        System.out.println("Rilis : " + detail[0]);
        System.out.println("Durasi : " + detail[1]);
        System.out.println("Genre : " + detail[2]);
        System.out.println("Sinopsis : " + detail[3]);
        System.out.println("Cast : " + detail[4]);
    }

    public static void searchList() {
        boolean found;
        String word = sl.nextLine();
        for (int i = 0; i < movielist.size(); i++) {
            String text = movielist.get(i);
            found = text.contains(word);
            if (found) {
                System.out.println((i + 1) + "." + movielist.get(i));
            }
        }
    }
}