public class Power{
    public static void main(String[] args) {
    	//base
        int b = 3;
        long result = 1;
        for (int exponent = 4;exponent != 0; --exponent)
        {
            result *= b;
        }
        System.out.println("Answer = " + result);
    }
}