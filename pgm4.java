import java.util.*;
public class Main
{
	public static void main(String[] args) {
	/*Program to define Bitwise operator funtionality*/
	    Scanner sc=new Scanner(System.in);
	    int x=sc.nextInt();
	    int y=sc.nextInt();
	
	    System.out.println("Bitwise Operators");
	    System.out.println(x+" Bitwise OR "+y+"="+(x|y));
	    System.out.println(x+" Bitwise AND "+y+"="+(x&y));
	    System.out.println(x+" Bitwise XOR "+y+"="+(x^y));
	    System.out.println(" Bitwise complement of"+x+"="+(~x));
	    System.out.println(" Bitwise complement of"+y+"="+(~y));

	}
}