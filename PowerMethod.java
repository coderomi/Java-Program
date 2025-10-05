import java.util.Scanner;
   
class PowerMethod{
   
	
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a Number:-");
		int num=sc.nextInt();
		System.out.print("Enter a exponent:-");
		int pow=sc.nextInt();
		powerOf(num,pow);


	}

	public static void powerOf(int num,int pow){
      int result=1;
      for(int i=1;i<=pow;i++){
      	result=result*num;

      }
      System.out.println("result:-"+result);

	


	}


	
}