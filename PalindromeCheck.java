import java.util.Scanner;
class PalindromeCheck{

 	static String str,rev="";
 	
 	public static void main(String[]args){
 		Scanner sc=new Scanner(System.in);
 		System.out.println("enter your String");
 		str=sc.next();
 		// System.out.println(str);
 		reveserString2();
 		// if(connd){
 		// 	System.out.println(str+"is palidromic string");
 		// }else{
 		// 	System.out.println(str+"is palidromic string");
 		
 		// }
 		if(str.equals(rev)){
 			System.out.println(str+":-is palidromic string");

 		}
 		else{
 		System.out.println(str+":-is  not a palidromic string");

 		}


 	}

 	// public static void reveserString(){
 	// 	for(int i=0;i<str.length();i++){
 	// 		rev=str.charAt(i)+rev;
 	// 	}

 		public static void reveserString2(){
 		for(int i=str.length()-1;i>=0;i--){
 			rev=rev+str.charAt(i);
 		}

 	}
	
}
