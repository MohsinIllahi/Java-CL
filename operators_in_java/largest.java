class largest{
	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=3;
		if (a>b && a>c) {
			System.out.println(a+" is L");
		} else if (a<b && a<c){
		 	System.out.println(a+"Small");
		} else if((a>b && a<c) || (a<b && a>c)){ 
		 	System.out.println(a+" Medium");
		 }

	if(b>a && b>c) {
		System.out.println(b+"Largest");
	}else if(b<a && b<c){
		System.out.println(b+"Smallest");
	}else if((b>a && b<c) || (b>a && b>c)){
		System.out.println(b+"Medium");
	}
	if (c>a && c>b) {
		System.out.println(c+"Largest");
	}else if (c<a && c<b) {
		System.out.println(c+"Smallest");
	}else if((c>b && c<a)||(c<b && c>a)){
		System.out.println(c+"Medium");
	}
	}
}