class inc2{
	public static void main(String[] args) {
		int a=4;
		int  b=a++;
		System.out.println(++a);
		System.out.println(a++ );
		System.out.println(b);
		System.out.println(++b);
        int b=a++ + ++a + a++;
        System.out.println(b);
	}
}