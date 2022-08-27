/* if Input x=3, output=-6*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    
	    x = x++ * 2 + 3 * -x;
	    
	    System.out.println(x);
	}
	
}