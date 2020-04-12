package baitapArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Movielist {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Bạn có bn bộ phim yêu thích?\n");
        int num = Scanner.nextInt();
//        System.out.println("Nhập danh sách phim ưa thích của bạn: ");
        List<String> yourMovie = new ArrayList<>();
        for (int a = 0; a < num; a++) {
            System.out.println("Nhập film thứ " + a + ":\n");
            yourMovie.add(Scanner.next());
        }
        int select;
        int True = 1;
        int j = 1;
        while (True >0) {
            System.out.println("1 trog 5");
            select = Scanner.nextInt();
            switch (select) {
                case 1:
                    System.out.println("Thêm Phim mới: ");
                    yourMovie.add(Scanner.next());
                    break;
                case 2:
                    System.out.println("List of movie: ");
                    yourMovie.forEach(movie -> {
                        System.out.println(movie);
                    });
                    break;
                case 3:
                    System.out.println("Bạn muốn sửa film thứ? : ");
                    int nmbr = Scanner.nextInt();
                    System.out.println("\nNhập tên film muốn sửa:\n");
                    String strg = Scanner.next();
                    yourMovie.set(nmbr, strg);
                    break;
                case 4:
                    System.out.println("Enter your name of movie you want to remove: ");
                    String name;
                    name = Scanner.next();
                    yourMovie.remove("name");
                    break;
                case 5:
                    System.out.println("Enter your name of movie you want to find:");
                    int nm = Scanner.nextInt();
                    if (nm > yourMovie.size()) {
                        System.out.println("Nothing\n");
                    } else {
                        System.out.println(" ở vị trí:" + nm + ":\n" + yourMovie.get(nm));
                    }
                    break;
                default:
                    System.out.println("Ngáo vch, nhập lại k?");

            }
            for (int i = 0; i < j; i++) {
                System.out.println("Tiep k?\n 1: co \t\t\t\t 2: Ko");
                select = Scanner.nextInt();
                if (select == 1 || select == 2) {
                    System.out.println("Có hay không thì cũng như nhau thôi:)-");
                } else {
                    System.out.println("Break");
                    True = -1;
                    j = -1;
                }
            }
        }

    }
}
