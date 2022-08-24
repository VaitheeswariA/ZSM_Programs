
/*Reverse the given number
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    
	    int rem=0,num=0;
	    
	    while(n>0)
	    {
	        rem=n%10;
	        num=(num*10)+rem;
	        n=n/10;
	    }
	    System.out.println(num);
	}
}