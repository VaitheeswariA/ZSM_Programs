import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int term=sc.nextInt();
	    int sum=0,sum1=0;
	    for(int i=0;i<term;i++)
	    {
	        sum=((sum*10)+1);
	        sum1+=sum;
	    }
	    
	    System.out.println(sum1);
	}
}