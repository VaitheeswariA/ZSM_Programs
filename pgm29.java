
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	/*Program to Check Whether a Character is a Vowel or Consonant*/
	    Scanner sc=new Scanner(System.in);
	   char ch=sc.next().charAt(0);
	    if(ch=='a'|| ch=='e'||ch=='i'||ch=='o'||ch=='u' 			  	||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
	    {
	        System.out.println("Given character is vowel");
	    }
	    else
	    {
	        System.out.println("Given character is consonant");
	    }
	    }
}

