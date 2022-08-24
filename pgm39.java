/*Java Program to print the smallest element in an array*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int length=sc.nextInt();
	    int[] arr=new int[length];
	    int min=0;
	    arr[0]=sc.nextInt();
	    min=arr[0];
	    
	    for(int i=1;i<length;i++)
	    {
	        arr[i]=sc.nextInt();
	        if(arr[i]<min)
	            min=arr[i];
	    }
	    
	    System.out.println("smallest number in the array is:"+min);
	    	    }
}
