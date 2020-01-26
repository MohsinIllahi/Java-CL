class Marksheet{
	public static void main(String[] args) {
		int a=45;
		if (a>80 && a<=100) {
			System.out.print("A+");
		}else if (a>=70 && a<=80){
			System.out.print("A");
		}else if (a>=60 && a<70) {
			System.out.print("B+");
		}else if (a>=50 && a<=59) {
			System.out.print("B");
		}else if (a<50) {
			System.out.print("FAIL");
		}else
		System.out.print("Given marks is not actual");
		}
	}
