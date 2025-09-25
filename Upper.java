import java.util.Scanner;

public class Upper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("Enter your Charcter");
        char ch=scanner.next().charAt(0);
        System.out.println((ch>='A' && ch<='Z')||(ch>='a' && ch<='z'));
    }
}
