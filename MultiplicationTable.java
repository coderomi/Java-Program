import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // user input number
        multiplicationTable(num, 1); // start recursion from 1
        sc.close();
    }

    public static void multiplicationTable(int num, int i) {
        if(i > 10) // base case: stop when i > 10
            return;

        System.out.println(num + " x " + i + " = " + (num * i)); // print multiplication
        multiplicationTable(num, i + 1); // recursive call with next i
    }
}
