/*Program to Calculate the Sum of Natural Numbers and find the largest digit of the sum.*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int limit=sc.nextInt();
	    int sum=(limit *(limit+1))/2;
	    System.out.println("sum of n natural numbers:"+sum);
	    int max=0,rem=0;
	    while(sum>0)
	    {
	        rem=sum%10;
	        if(rem>max)
	            max=rem;
	            
	       sum=sum/10;
	    }
	    System.out.println("Largest digit of the sum is:"+max);
	    }
}
