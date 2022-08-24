import java.util.*;
public class Main
{
	public static void main(String[] args) {
	/*left rotation of multidimentional array*/
	    Scanner sc=new Scanner(System.in);
	    int row=sc.nextInt();
	    int col=sc.nextInt();
	    
	    int[][] arr=new int[row][col];
	    
	    for(int i=0;i<row;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	            arr[i][j]=sc.nextInt();
	        }
	    }
	    int temp=arr[0][0];
	    
	    for(int i=0;i<row;i++)
	    {
	        for(int j=0;j<col;j++)
	        {
	            if(j!=col-1)
	            {
	                arr[i][j]=arr[i][j+1];
	            }
	            else if(i!=j)
	            {
	                arr[i][j]=arr[i+1][0];
	            }
	        }
	    }
	   arr[row-1][col-1]=temp;
	   
	   for(int i=0;i<row;i++)
	   {
	       for(int j=0;j<col;j++)
	       {
	           System.out.print(arr[i][j]+" ");
	       }
	       System.out.println();
	   }
		
	}
}
