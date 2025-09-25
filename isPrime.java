import java.util.Scanner;

class isPrime{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		for(;;){
		int num=sc.nextInt();
		//boolean flag=true;
		int count=0;
		if(num==1){
			System.out.println("Not a prime");
			continue;
		}
         //Math.sqrt(num)
		for(int i=2;i<=num/2;i++){
				if(num%i==0){
					// flag=false;
					// break;
					count++;
				}
			}	
		    if(count==0){ 
			System.out.println(" prime NUmber");

		    }
		    else{
			System.out.println("Not a prime");

		   }
	   }
	
   }
}
	
