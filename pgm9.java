import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n1=sc.nextInt();
	    int n2=sc.nextInt();
	    int[] arr1=new int[n1];
	    int[] arr2=new int[n2];
	    for(int p=0;p<n1;p++)
	    {
	        arr1[p]=sc.nextInt();
	    }
	    for(int q=0;q<n2;q++)
	    {
	        arr2[q]=sc.nextInt();
	    }
	    Set<Integer> merged=new HashSet<Integer>();
	    for(int i=0;i<arr1.length;i++)
	    {
	        merged.add(arr1[i]);
	    }
	    for(int j=0;j<arr2.length;j++)
	    {
	        merged.add(arr2[j]);
	    }
	    int n=merged.size();
	    int[] op=new int[n];
	    int i=0;
	    for(int x:merged)
	    {
	        op[i++]=x;
	    }
	    
	    Arrays.sort(op);
	    
	    for(i=0;i<op.length;i++)
	    {
	        System.out.print(op[i]+" ");
	    }
	    
	}
	
}