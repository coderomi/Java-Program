import java.util.Scanner;

class PrimeNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		if(num==1){
			System.out.println("Not a prime number");
		}
		else{
			for(;;){
				int den=2;
		while(den<=num/2){
			if(num%den==0){
				break;
			}
			den++;
		}
		if(den>=num/2){
			System.out.println("It is prime");

		}
		else {
			System.out.println("Not a prime Number");
		}
			}
	}
}
	
}