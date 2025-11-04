import java.util.Scanner;


public class SumOfDigitRecursion{

	public static int SumOfDigit(int n){
		if(n==0){
			return 0;
		}

		return SumOfDigit(n/10)+(n%10);
	}

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(SumOfDigit(n));

	}

}