import java.util.*;
public class Main
{
	public static void main(String[] args) {
	/*Program to Check Whether a Character is an Alphabet or not*/
	      Scanner sc=new Scanner(System.in);
	     char c1=sc.next().charAt(0);
	    if((c1>=65 && c1<=90) ||(c1>=97 && c1<=122))
	    {
	        System.out.println("given character is an alphabet");
	    }
	    else
	    {
	        System.out.println("Given character is not an alphabet");
	    }
	    }
}
