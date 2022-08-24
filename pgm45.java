/*Java Program to print the sum of all the items of the array*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int length=sc.nextInt();
	    int[] arr=new int[length];
	    int sum=0;
	    
	    for(int i=0;i<length;i++)
	    {
	        arr[i]=sc.nextInt();
	        sum+=arr[i];
	    }
	    System.out.println("Sum of elements in array:"+sum);
	    
	}
	
}
