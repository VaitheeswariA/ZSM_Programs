/*Java Program to rotate the elements of an array in the right direction*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int length=sc.nextInt();
	    int[] arr=new int[length];
	    int temp=0;
	    
	    for(int i=0;i<length;i++)
	    {
	        arr[i]=sc.nextInt();
	        
	    }
	    
	    temp=arr[length-1];
	    for(int j=length-1;j>0;j--)
	    {
	        arr[j]=arr[j-1];
	    }
	    arr[0]=temp;
	    
	    
	    System.out.println("After right rotation:");
	    for(int i=0;i<length;i++)
	    {
	        System.out.println(arr[i]);
	    }
	}
	
}
