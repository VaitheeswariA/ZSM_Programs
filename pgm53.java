import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    int n=0;
	    String output="";
	    int temp=0;
	    for(int i=0;i<s.length();i++)
	    {
	        if(s.charAt(i)>='a' && s.charAt(i)<='z')
	        {
	            temp=i;
	            n=0;
	           if(i<s.length() && Character.isDigit(s.charAt(i+1)))
	           {
	               n=s.charAt(i+1)-'0';
	               System.out.println(s.charAt(i+1));
	               System.out.println(n);
	               i++;
	               if(i<s.length()-1 && Character.isDigit(s.charAt(i+1)))
	               {
	                   n=(n*10)+(s.charAt(i+1)-'0');
	                   i++;
	               }
	               
	               for(int j=0;j<n;j++)
	                   {
	                       output+=s.charAt(temp);
	                   }
	           }
	        }
	    }
	    System.out.println(output);
	   
	}
}