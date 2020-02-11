class switch2 {
    public static void main(String[] args) {
    	char operator='*';
    	int number1, number2, result;
    	

    	number1 =2;
    	number2 =3;
      
    	
    	switch (operator) {
         case '+':
           result = number1 + number2;
    	   System.out.print(number1 + "+" + number2 + " = " + result);
           break;
         case '-':
           result = number1 - number2;
           System.out.print(number1 + "-" + number2 + " = " + result);
           break;
         case '*':
           result = number1 * number2;
           System.out.print(number1 + "*" + number2 + " = " + result);
           break;
         }
       }
     }