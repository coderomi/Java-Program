import java.util.Scanner;

class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sumEven = 0, sumOdd = 0;

        // process digit by digit
        while (n > 0) {
            int last = n % 10;   // extract last digit
            if (last % 2 == 0) {
                sumEven += last;
            } else {
                sumOdd += last;
            }
            n /= 10; // remove last digit
        }

        System.out.println("Sum of Even digits = " + sumEven);
        System.out.println("Sum of Odd digits  = " + sumOdd);

        if (sumEven == sumOdd) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

    }
}
