import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	    int[] arr1=new int[n1];
	    int[] arr2=new int[n1];
	    for(int p=0;p<n1;p++)
	    {
	        arr1[p]=sc.nextInt();
	    }
	    Arrays.sort(arr1);
	    int large=n1-1,small=0;
	    boolean cond=true; 
	    for(int i=0;i<n1;i++)
	    {
	        if(cond)
	            arr2[i]=arr1[large--];
	        else
	            arr2[i]=arr1[small++];
	       cond=!cond;
	    }
	    
	    for(int i=0;i<n1;i++)
	    {
	        System.out.print(arr2[i]+" ");
	    }
	}
	
}