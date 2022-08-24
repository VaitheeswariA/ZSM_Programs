/*Java Program to copy all elements of one array into another array*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int[] arr1={1,2,3,4,5,6,7,8,9};
	    int[] arr2=new int[arr1.length];
	    
	   for(int i=0;i<arr1.length;i++)
	   {
	       arr2[i]=arr1[i];
	       System.out.println(arr2[i]);
	   }
	    
	    
	}
	
}
