import java.util.Scanner;

public class ReverseNumberRec{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.print("Reversed number: ");
        reverseNumber(num);
        System.out.println(); 
    }

   
    public static void reverseNumber(int num) {
        if (num == 0) {
            return; 
        }
        System.out.println(num % 10);   
        reverseNumber(num / 10);       
    }
}
