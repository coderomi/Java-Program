import java.util.Scanner;

public class library {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String name=sc.next();
        short students=20000;
        short books=4000;
        short charis=400;
        short Studytable=300;
        short staff=50;
        System.out.println("name of library:-"+name);
        System.out.println(+books+ ":-books in the library");
        System.out.println(+charis+":-charis in the library");
        System.out.println(+Studytable+" :-studytable in the library ");
        System.out.println(+staff+":-staff in the library");
    }
}
