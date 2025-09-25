import java.util.Scanner;

class ReversedPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int originalNum = num;  // store original number
        int reversed = 0;

        if (num == 1) {
            System.out.println("Not a prime number");
        } else {
            // Check prime
            int den = 2;
            while (den <= num / 2) {
                if (num % den == 0) {
                    break;
                }
                den++;
            }

            if (den > num / 2) { // prime
                // Reverse the number
                int temp = originalNum;
                while (temp > 0) {
                    reversed = reversed * 10 + (temp % 10);
                    temp = temp / 10;
                }

                System.out.println(originalNum + " is prime");
                System.out.println("Reversed number: " + reversed);
            } else {
                System.out.println(originalNum + " is not a prime number");
            }
        }
    }
}
