/*Program to Find Factorial of a Number and the factorial number's sum of digits.*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int num=sc.nextInt();
	    int fact=1;
	    //int fact=factorial(num);
	    for(int i=2;i<=num;i++)
	    {
	      fact=fact*i;  
	    }
	    System.out.println(fact);
	    
	    int rem=0,sum=0;
	    while(fact>0)
	    {
	        rem=fact%10;
	        sum=sum+rem;
	        fact=fact/10;
	    }
	    System.out.println("Sum of factorial value digit is:"+sum);
	    
	    }
	/*static int factorial(int num)
	    {
	        if(num==0)
	            return 1;
	       
	       return num*factorial(num-1);
	    }*/
}

