import java.util.*;
public class Main
{
	public static void main(String[] args) {
	/*Largest among 3 numbers*/
	    Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
	    int n3=sc.nextInt();
	    
	    if(n1>n2 && n1>n3)
	    {
	        System.out.println("n1 is largest");
	    }
	    else if(n2>n1 && n2>n3)
	    {
	        System.out.println("n2 is largest");
	    }
	    else
	    {
	        System.out.println("n3 is largest");
	    }
	    }
}
