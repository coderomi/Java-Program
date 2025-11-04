class reverseTriangular{
	public static void main(String[]args){
		int n=5;
		int num=0;
		for(int i=1;i<=n;i++){
			num+=i;
			for(int j=0;j<i;j++){
				System.out.print((num-j)+" ");
				System.out.println();
			}
			System.out.println();
		}
	}
}