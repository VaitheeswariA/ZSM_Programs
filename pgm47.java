
/*pattern printing input:9
output:
        1
       121
      12321
     1234321
    123454321
   12345654321
  1234567654321
 123456787654321
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
	        int left=1;
	        for(int j=i;j<n-1;j++)
	        {
	            System.out.print("  ");
	        }
	        for(int k=0;k<=i;k++)
	        {
	            System.out.print((left++)+" ");
	        }
	        int right=i;
	        for(int l=0;l<i;l++)
	        {
	            System.out.print((right--)+" ");
	        }
	        System.out.println();
	    }
	}
}