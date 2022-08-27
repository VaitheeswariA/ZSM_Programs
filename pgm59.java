import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    String s1=sc.next();
	    String s2=sc.next();
	    int index=-1,count=1;
	    for(int i=0;i<s1.length()-s2.length();i++)
	    {
	        if(s1.charAt(i)==s2.charAt(0))
	        {
	            index=i;
	            int j;
	            for(j=0;j<s2.length();j++)
	            {
	                if(s1.charAt(i+j)!=s2.charAt(j))
	                {
	                    break;
	                }
	            }
	            if(j==s2.length())
	            {
	                index =i;
	            }
	            else{
	                index=-1;
	            }
	        }
	    }
	    System.out.println(index);
	}
}