 import java.util.Scanner;
 class NumberPresentOrNot{
 	public static void main(String[]args){
 		Scanner sc=new Scanner(System.in);
 		System.out.println("Enter your number");

 		int n=sc.nextInt();
 		System.out.println("Enter your number you want to search");
 		int search=sc.nextInt();
 		int last=0;
 		boolean found=false;
 		// while(n>0){
 		// 	last=n%10;
 		// 	if(last==search){
 		// 		found=true;
 		// 		break;
 		// 	}
 		// 	n/=10;
 		for(;n>0;n/=10){
 			last=n%10;
 			if(last==search){
 				found=true;
 				break;
 			}
 			
 		}

 		if(found){
 			System.out.println("number is present");

 		}else{
 			System.out.println("number is not present");
 		}
 	}

}