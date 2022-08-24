/*Write a program to print the following pattern based on the alphabet.
Example 1:
Input: E
Output:
EEEEE
DDDD
CCC
BB
A*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    char c=sc.next().charAt(0);
	    char p=c;
	    for(int i=0;i<=(c-65);i++)
	    {
	        for(int j=p;j>=65;j--)
	        {
	            System.out.print(p+" ");
	        }
	        System.out.println();
	        p--;
	    }
	}
}