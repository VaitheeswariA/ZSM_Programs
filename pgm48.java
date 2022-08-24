
/*pattern printing input:9
output:
        9
       898
      78987
     6789876
    567898765
   45678987654
  3456789876543
 234567898765432
12345678987654321
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    for(int i=0;i<n;i++)
	    {
	        int left=n-i;
	        for(int j=i;j<n-1;j++)
	        {
	            System.out.print("  ");
	        }
	        for(int k=0;k<=i;k++)
	        {
	            System.out.print((left++)+" ");
	        }
	        int right=n-1;
	        for(int l=0;l<i;l++)
	        {
	            System.out.print((right--)+" ");
	        }
	        System.out.println();
	    }
	}
}