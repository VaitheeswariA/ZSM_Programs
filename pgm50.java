/*pattern printing
9 9 9 9 9 9 9 9 9
 8 8 8 8 8 8 8 8 
  7 7 7 7 7 7 7
   6 6 6 6 6 6
    5 5 5 5 5
     4 4 4 4
      3 3 3
       2 2
        1
*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int p=n;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<i;j++)
		    {
		        System.out.print(" ");
		    }
		    for(int k=n;k>i;k--)
		    {
		        System.out.print(p+" ");
		    }
		    System.out.println();
		    p--;
		}
	}
}