import java.util.*;
public class Main
{
	public static void main(String[] args) {

	    Scanner sc=new Scanner(System.in);
	     int a=sc.nextInt();
	     int b=sc.nextInt();
	     int x;
	     //++a-b- illegal expression
	     a=a%b++;
	     System.out.println(a);
	     a*=b+5;
	     System.out.println(a);
	     x=55>>>2;
	     System.out.println(x);
	    }
}