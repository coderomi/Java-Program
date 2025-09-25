import java.util.Scanner;

class PrimeNew {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (;;) {   // infinite loop for multiple inputs
            int num = sc.nextInt();
            int originalNum=num;

            if (num <= 1) {
                System.out.println("Not a prime number");
                continue;
            }
            if (num <= 3) {
                System.out.println("prime number");
                continue;
            }
            if (num % 2 == 0 || num % 3 == 0) {
                System.out.println("Not a prime number");
                continue;
            }

            for (int i = 5; i * i <= num; i += 6) {
                if (num % i == 0 || num % (i + 2) == 0) {
                    System.out.println("Not a prime number");
                    continue;   // skip printing "prime number"
                }
            }

            System.out.println("prime number");

            //reverse the number
            int rev=0;
            int temp=originalNum;
            while(temp!=0){
                rev=rev*10+temp%10;
                temp/=10;
            }
            System.out.println("rev:-"+rev);

            // //
            // if(originalNum==rev){
            //     System.out.println(originalNum+"is a palindrome");
            // }
            // else{
            //     System.out.println(originalNum+"is not a palindrome");


            }
        }
    }

