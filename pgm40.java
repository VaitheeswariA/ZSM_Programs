/*Java Program to print the number of elements present in an array*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	  
	    int[] arr={1,5,4,66,73,12,33,51,0,90};
	   
	    int count=0;
	    
	    for(int i:arr)
	    {
	        count++;
	    }
	    
	    System.out.println("number of elements in the array is:"+count);
	   // System.out.println("number of elements in the array is:"+arr.length);    
	}
