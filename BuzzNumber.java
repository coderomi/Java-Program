 import java.util.Scanner;
 class BuzzNumber{
 	public static void main(String[]args){
 		Scanner sc=new Scanner(System.in);
 		int num=sc.nextInt();
 		boolean flag=false;
 		int temp=num;
 		while(temp>0){
 			if(temp%7==0 || temp%10==7){
 				 flag=true;
 				 
 			}
 			break;

 		}

 		if(flag){
 			System.out.println("buzzNumber");
 		}
 		else{
 			System.out.println(" not buzzNumber");


 		}
 	}
 }