public class Practice{
	
	public static void main(String[]args){

		// for (int i=0; i<5; i++);   // <- semicolon = empty body
		// {
    	// 	System.out.println("Hello");
		// }
		// for(; ;){

		// }
// 		int i = 0;
// for(; i < 5; i++);  // loop runs, i increments, body empty
// System.out.println(i); // prints 5
		
		// for(int i=0;false;i++){
		// 	System.out.println(i);
		// }
		break;
		for(int i = 0; i < 2; i++){         // Outer loop
    for(int j = 0; j < 3; j++){     // Inner loop
        if(j == 1) {                // Break condition
            System.out.println("Breaking inner loop at i=" + i + ", j=" + j);
            break;                   // Exit inner loop
        }
        System.out.println("Inside loop: i=" + i + ", j=" + j);
    }
}




	}
}
