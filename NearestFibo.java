import java.util.Scanner;
class NearestFibo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        int n1 = 0, n2 = 1, n3 = 0;

        // Generate Fibonacci until n2 > num
        while (n2 <= num) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }

        // Now n1 <= num < n2
        if (num - n1 <= n2 - num) {
            System.out.println(n1 + " is the nearest Fibonacci number");
        } else {
            System.out.println(n2 + " is the nearest Fibonacci number");
        }
    }
}
