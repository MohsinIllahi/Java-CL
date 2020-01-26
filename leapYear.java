class LeapYear{
	public static void main(String[] args) {
	      int year = 2014;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    System.out.println("Leap Year");
                else
                    System.out.println("Not Leap Year");
            }
            else
                System.out.println("Leap Year");
        }
        else
            System.out.println("Not Leap Year");
//If we use only 1st condition which is ( year%4==0 )then 1990 will also be Leap Year
	}
	}
