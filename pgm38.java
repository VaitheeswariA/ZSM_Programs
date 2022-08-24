/*Java Program to print the largest element in an array*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int length=sc.nextInt();
	    int[] arr=new int[length];
	    int max=0;
	    
	    for(int i=0;i<length;i++)
	    {
	        arr[i]=sc.nextInt();
	        if(arr[i]>max)
	            max=arr[i];
	    }
	    
	    System.out.println("Largest number in the array is:"+max);
	    }
}
