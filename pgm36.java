/* Program to print the elements of an array present on even position*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int length=sc.nextInt();
	    int[] arr=new int[length];
	    
	    for(int i=0;i<length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    
	    System.out.println("Even position elements of the array");
	    
	    for(int j=0;j<length;j++)
	    {
	        
	        if(j%2==0)
	        {
	            System.out.println(arr[j]);
	        }
	        
	    }
	   
	    }
}
