class Numbers{
	
     static int num1=100;
	public static void main(String[]args){
      printNumber();

	}

	public static void printNumber(){
		
		 // if (num1 %2==0)System.out.println(num1);
		 
         System.out.println(num1);
		 if(num1-- <1) return;
		 printNumber();
	}
}
