import java.util.*;

class ReverseMethod {

    static int num;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number: ");
        num = sc.nextInt();   // ✅ assign directly to static variable

        System.out.println("Before: " + num);
        reverseM();
        System.out.println("After: " + num);
    }

    public static void reverseM() {
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        num = rev;   // ✅ assign reversed value back
    }
}
