import java.util.Scanner;

class FactorFinder {

    static int num;   // number to find factors for

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();   // input number

        findFactors();        // call void no-argument method
    }

    public static void findFactors() {  // no-argument void method
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println(); // new line after printing all factors
    }
}
