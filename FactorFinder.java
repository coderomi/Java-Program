import java.util.Scanner;

class FactorFinder {

    static int num;  

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        num = sc.nextInt();   

        findFactors();       
    }

    public static void findFactors() {  
        System.out.print("Factors of " + num + " are: ");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.println(i + " ");
            }
        }
        System.out.println(); 
    }
}
