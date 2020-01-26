class Swipe{
	public static void main(String[] args) {
		/*int a=2;
		int b=3;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a+" "+b);*/
        int a=2;
		int b=3;
		int temp=a+b;
		a=temp-a;
		b=temp-b;
		System.out.print(a+" "+b);

	}
}