import java.util.Scanner;

class PersonalInfo{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your name:-");
		String name = sc.nextLine();
		System.out.print("Enter your PhoneNo:-");
		long PhNumb=sc.nextLong();
		System.out.print("Enter your Cgpa:-");
		double cgpa=sc.nextDouble();
		System.out.println("Enter your emailId:- ");
		String email=sc.nextLine();
		System.out.println("Enter your YOP:-");
		int yop=sc.nextInt();

		System.out.println("Enter your DOB:-");
		String dateOf =sc.nextLine();



	}
}