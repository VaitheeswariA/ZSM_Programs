/*Java Program to find the frequency of each element in the array*/
import java.util.*;
import java.util.Map.Entry;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int length=sc.nextInt();
	    int[] arr=new int[length];
	    HashMap<Integer,Integer> freq=new HashMap<>();
	    int count=0;
	    
	    for(int i=0;i<length;i++)
	    {
	     arr[i]=sc.nextInt();
	    }
	    
	    for(int j=0;j<arr.length;j++)
	    {
	        if(freq.containsKey(arr[j]))
	        {
	            freq.put(arr[j],freq.get(arr[j])+1);
	        }
	        else
	        {
	            freq.put(arr[j],1);
	        }
	    }
	    
	    for(Entry<Integer,Integer> v:freq.entrySet())
	    {
	        System.out.println("Frequency of"+v.getKey()+" is "+v.getValue());
	    }
	    
	}
	
}
