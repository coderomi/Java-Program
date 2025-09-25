import java.util.Scanner;

class XylemPhloem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sumOfEnd = num % 10;   // last digit
        int sumOfMid = 0;
        num /= 10;

        System.out.println("Last digit taken: " + sumOfEnd);

        while (num > 9) {
            int digit = num % 10;
            sumOfMid = sumOfMid + digit;
            System.out.println("Adding middle digit: " + digit + " | Current mid sum: " + sumOfMid);
            num /= 10;
        }

        System.out.println("First digit: " + num);
        System.out.println("Sum of middle digits = " + sumOfMid);
        System.out.println("Sum of end digits before adding first = " + sumOfEnd);

        sumOfEnd = sumOfEnd + num; // add first digit

        System.out.println("Final sum of end digits (first + last) = " + sumOfEnd);

        if (sumOfMid == sumOfEnd) {
            System.out.println("It is Xylem");
        } else {
            System.out.println("It is not Xylem");
        }
    }
}
