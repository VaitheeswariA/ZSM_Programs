/*Java Program to left rotate the elements of an array*/
import java.util.*;
import java.util.Map.Entry;
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
	    
	    int temp=arr[0];
	    
	    for(int j=0;j<length-1;j++)
	    {
	        arr[j]=arr[j+1];
	        
	    }
	    
	    arr[length-1]=temp;
	    System.out.println("After left rotation");
	    for(int i=0;i<length;i++)
	    {
	        System.out.println(arr[i]);
	    }
	}
	
}
