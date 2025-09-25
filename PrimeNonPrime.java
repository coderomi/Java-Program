import java.util.Scanner;

public class  PrimeNonPrime{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 1) {
            System.out.println(n + " is not prime");
        } else {
            int i;
            for (i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    break;
                }
            }
            if (i * i > n) {
                System.out.println(n + " is prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }
    }
}
