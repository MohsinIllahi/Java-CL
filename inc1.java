class inc1{
	public static void main(String[] args) {
		int a=4;
		int b=++a;
		int c=b++;
		System.out.println(a++);
		System.out.println(b++);
		System.out.println(c++);
		int d=a++ + b++ + c++ + c++;
		System.out.println(d);
	}
}