import java.util.Scanner;
class ReversedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = 0;

        for (; num != 0; num /= 10, ans = ans * 10 + (num % 10));

        System.out.println(ans);
    }
}
