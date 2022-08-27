import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int r1=sc.nextInt();
	    int r2=sc.nextInt();
	    double space;
	    
	    space=(3.14*r1*r1)-(3.14*r2*r2);
	    
	    System.out.println(Math.abs(space));
	}
	
}