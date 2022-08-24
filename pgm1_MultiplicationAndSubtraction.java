import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		System.out.println("Multiplication table");
		for(int i=1;i<=20;i++)
		   {
		     System.out.println(N+" * "+i+"="+N*i);
		    }

		System.out.println("Subtraction table");
		for(int j=N;j<=20;j++)
		{
		   System.out.println(j+" - "+N+"="+(j-N));
		}
	}
      }
