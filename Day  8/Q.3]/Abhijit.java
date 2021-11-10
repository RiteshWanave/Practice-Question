/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in) ;
		
		int t = sc.nextInt() ;
		
		while (t-- > 0)
		{
		    long n = sc.nextLong(), k = sc.nextLong() ;
		    
		    long sum = 0 ;
		    
		    for (int i = 0 ; i < n ; i++)
		    {
		        sum += sc.nextInt() ;
		    }
		    
		    System.out.println(sum%k) ;
		    
		}
	}
}
