import java.util.*;
public class Main
{
	public static void main(String[] args) {
	/*Program to Swap Two Numbers*/
	    Scanner sc=new Scanner(System.in);
	   int num1=sc.nextInt();
	    int num2=sc.nextInt();
	    System.out.println("Before swap:"+num1+","+num2);
	    int temp=num1;
	    num1=num2;
	    num2=temp;
	    System.out.println("After swap:"+num1+","+num2);
	    }
}
