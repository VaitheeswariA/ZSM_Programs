
/*If x=5, x1=-7*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int x1;
	    x1=++x - x++ + -x;
	    
	    System.out.println(x1);
	}
	
}