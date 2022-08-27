import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int start=sc.nextInt();
	    int end=sc.nextInt();
	    int limit=sc.nextInt();
	    int grpcount=sc.nextInt();
	    
	    for(int i=0;i<grpcount;i++)
	    {
	        System.out.println("Group:"+(i+1));
	        int s=start+i;
	        for(int j=0;j<limit/grpcount;j++)
	        {
	            System.out.println(s);
	            s=s+grpcount;
	        }
	    }
	    
	}
	
}