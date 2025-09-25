import java.util.Scanner;

class PerfectNumber{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int den=1;
		while(den<=num/2){
			if(num%den==0){
				sum+=den;
			}
			den++;
		}
		if(num==sum){
			System.out.println("It's perfect number");
		}
		else{
			System.out.println("It's not perfect number");

		}
	}

}