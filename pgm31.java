
import java.util.*;
public class Main
{
	public static void main(String[] args) {
/*Program to Find the Roots of a Quadratic Equation*/
	    Scanner sc=new Scanner(System.in);
	     double a=sc.nextDouble();
	    double b=sc.nextDouble();
	    double c=sc.nextDouble();
	    double root1=0,root2=0;
	    double val=0;
	    val=(b*b)-(4*a*c);
	    if(val>0)
	    {
	        root1=(-b+Math.sqrt(val))/(2*a);
	        root2=(-b-Math.sqrt(val))/(2*a);
	        System.out.println(root1+","+root2);
	    }
	    else if(val==0)
	    {
	        root1=(-b/(2*a));
	        root2=(-b/(2*a));
	        System.out.println(root1+","+root2);
	    }
	    else
	    {
	        double real=(-b/(2*a));
	        double imaginary=(Math.sqrt(-val)/(2*a));
	        System.out.printf("\nFirstroot= %.2f+%.2fi",real,imaginary);
	        System.out.printf("\nSecondroot= %.2f-%.2fi",real,imaginary);
	    }
	    }
}

