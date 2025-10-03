 import java.util.Scanner;
 class factorialMethod{
 	static int num;
 	public static void main(String[]args){
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter your number");
 		num=sc.nextInt();
 		fact1();



 	}

 	public static void fact1(){
 		int fact=1;
 		while(num>0){
 			fact=fact*num;
 			num--;
 		}
 		  System.out.println("Factorial is: " + fact);

 	}

 }