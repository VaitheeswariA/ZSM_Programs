
/*pattern printing input:10
output:
   1
  2 3
 4 5 6
7 8 9 10
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	    int n=findvalueofN(t);
		int start=1;
		for(int i=0;i<n;i++)
		{
		    for(int j=i;j<n-1;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int k=0;k<=i;k++)
		    {
		        System.out.print((start++)+" ");
		    }
		    
		   System.out.println();
		}
	}
		
		static int findvalueofN(int total)
		{
		    int sum=0;
		    for(int i=1;sum<total;i++)
		    {
		        sum+=i;
		        if (sum==total)
		            return i;
		    }
		    return -1;
		}
		
	
}