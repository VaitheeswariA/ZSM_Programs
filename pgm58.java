
/*pattern printing input:4
output:
********
***__***
**____**
*_______*
**____**
***__***
********
*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    for(int j=i;j<n;j++)
		    {
		        System.out.print("*");
		    }
		    for(int k=0;k<i;k++)
		    {
		        System.out.print("__");
		    }
		    for(int l=i;l<n;l++)
		    {
		        System.out.print("*");
		    }
		   System.out.println();
		}
		for(int i=0;i<n-1;i++)
		{
		    for(int p=0;p<=i+1;p++)
		    {
		        System.out.print("*");
		    }
		    for(int q=i;q<n-2;q++)
		    {
		        System.out.print("__");
		    }
		    for(int p=0;p<=i+1;p++)
		    {
		        System.out.print("*");
		    }
		    
		    System.out.println();
		}
	}
}