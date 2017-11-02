# Lab10
public class highPalindrome 
{
	public static void main ( String [] args )
	{
		largest();
	}
	
	public static void largest ()
	{
		int limit = 10000;
		int test = 0 ;
		
		for ( int i = 1000 ;  i < limit ; i ++)
		{
			for ( int j = 1000 ; j < limit ; j ++ )
			{
				test = i * j ;
				
				if ( test < 100000000)
				{
				 if ( isAPalindrome(test))
					System.out.println(test);	
				}		
			}
		}
		
		
		
	}

	 public static boolean isAPalindrome ( int number )
	 {
		 String str = String.valueOf(number);
		 int first = 0 ; 
		 int last = str.length()-1;
		
		 while (first <= last )
		 {
			 if ( str.charAt(first) == str.charAt(last))
			 {
				 first++;
				 last--;
			 }
			 else 
			 {
				 return false; 
			 }
		 }
		 return true; 
		 
	 }	
}
