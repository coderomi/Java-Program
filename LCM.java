
import java.util.Scanner;
class LCM{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int largest=n1>n2? n1:n2;
		for(int i=1;;i++){
			if((largest*i)%n1==0 && (largest*i)%n2==0)
				{
					System.out.println("The lcm is :"+(largest*i));
				break;
				}
		}
	}
}