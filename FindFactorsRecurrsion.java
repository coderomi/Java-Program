import java.util.Scanner;

class FindFactorsRecurrsion{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		FindFactors1 (num,i);

	}

	public static  void  findFactors1(int num,int i){
		if(num%i==0) 
			System.out.println(i+" ");
		i++;
		if(i>num) return;
		FindFactors1(num,i);




	}
	
}