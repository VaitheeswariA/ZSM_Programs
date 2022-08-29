import java.util.*;
public class Main
{
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] arr=new int[n];
	    for(int i=0;i<arr.length;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    
	    HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	    
	    for(int i=0;i<arr.length;i++)
	    {
	        if(map.get(arr[i])!=null)
	            map.put(arr[i],map.get(arr[i])+1);
	        else
	            map.put(arr[i],1);
	    }
	    System.out.println("duplicate elements in the array:");
	    for(Map.Entry<Integer,Integer> entry:map.entrySet())
	    {
	        if(entry.getValue()>1)
	        {
	            System.out.print(entry.getKey()+" ");
	        }
	    }
	   
	}
	
}