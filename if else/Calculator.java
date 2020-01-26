class Calculator{
	public static void main(String[] args) {
		//choice of operation
		char c='d';
		int a=6;
		int b=2;
		if (c=='a') {
			System.out.println("Addition");
			System.out.println( a+b );
		}else if (c=='b') {
			System.out.println("Subtraction");
			 System.out.println(a-b);
		}else if (c=='c') {
			System.out.println("Multiplication");
			System.out.print(a*b);
		}else if (c=='d') {
			System.out.println("Division");
			System.out.print(a/b);
		}else{
			System.out.print("Your given character is not matching for operation");
		}
	}
}