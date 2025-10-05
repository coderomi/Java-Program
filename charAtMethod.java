import java.util.Scanner;
import java.util.Arrays;

class charAtMethod{
	public static void main(String[]args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String");
		String str=sc.next();
		for(int i=0;i<str.length();i++){
			char op=charAt(str,i);
			System.out.println(op+" ");
			Thread.sleep(500);

		}


	}

	public static char charAt(String str,int index){
		char[]arr=str.toCharArray();
		char ch=arr[index];
		return ch;
	}
}