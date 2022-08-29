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
	    sortEvenOdd(arr);
	}
	
	 public static void sortEvenOdd(int[] nums) {
        if(nums.length<3)
            display(nums);
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if (i%2 == 0) 
                even.add(nums[i]);
                else 
                odd.add(nums[i]);
            }
        
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
		
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
             if (i%2 == 0) 
               ans[i]=even.get(j++);
             else 
               ans[i]=odd.get(k++);
        }
        display(ans);
    }
    
    public static void display(int[] nums)
    {
        int i=0;
        for(i=nums.length-1;i>0;i--)
        {
                System.out.print(nums[i]+",");
        }
        System.out.print(nums[i]);
    }

}