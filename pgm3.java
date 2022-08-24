import java.util.*;
public class Main
{
	public static void main(String[] args) {
	 /*Difference between the given number and its reverse*/
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int rem=0,num=0,n1=n;
	    
	    while(n1>0)
	    {
	        rem=n1%10;
	        num=(num*10)+rem;
	        n1=n1/10;
	    }
	    
	    System.out.println(n-num);

	}
}
