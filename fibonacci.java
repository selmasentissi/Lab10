
public class fibonacci {

	
	public static void  main ( String [] args )
	{
		fibo();
	}
	 public static void fibo ( )
	 {
		 int i = 0 ;
		 int j = 1 ; 
		 int tr ;
		 int val1 = 0 ; 
		
		 for ( int val = 0 ; val < 2000000 ; i =j  , j = tr + i )
		 {
			 val = i + j ; 
			 tr = i;
            if (val % 2 == 0 )
            {
			 System.out.println(val);
			 val1 =+ val;
            }
		 }
		 System.out.println("The sum of the odd values is " + val1);
		 }
	 
	
}
