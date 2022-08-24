
/*pattern printing input:5
output:
1   5
 2 4
  3  
 2 4
1   5*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    for(int i=1;i<=n;i++)
	    {
	        for(int j=1;j<=n;j++)
	        {
	            if(i==j)
	            {
	                System.out.print(i);
	            }
	            else if((i+j)==n+1)
	            {
	                System.out.print(j);
	            }
	            else{
	                System.out.print(" ");
	            }
	        }
	        System.out.println();
	    }
	    
	}
}