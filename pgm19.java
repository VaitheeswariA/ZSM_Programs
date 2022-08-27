/*shows error because ,cant leave final expression without valid operand--illegal expression*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    
	    a+=a++ + ++a + -a + a-;
	    
	    System.out.println(a);
	}
	
}