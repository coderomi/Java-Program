import java.util.Scanner;


class LengthOfNumber{

	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Number");
		int num=sc.nextInt();
		lengthOf( num);
	}

	public static void lengthOf(int num){
		
		int count=0;
		while(num!=0){
			
			num/=10;
			count++;


}
		
		System.out.println("Length Of Number:-"+count);
			
	}
}