import java.util.Scanner;

class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) { // infinite loop to keep asking numbers
            System.out.print("Enter a number (or 0 to exit): ");
            int num = sc.nextInt();

            if (num == 0) {  // exit condition
                System.out.println("Exiting...");
                break;
            }

            if (num == 1) {
                System.out.println("Not a prime number");
            } else {
                int den = 2;
                while (den <= num / 2) {
                    if (num % den == 0) {
                        break;
                    }
                    den++;
                }

                if (den > num / 2) {  // no divisor found
                    System.out.println("It is prime");
                } else {
                    System.out.println("Not a prime number");
                }
            }
        }
    }
}
