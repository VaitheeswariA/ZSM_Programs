import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String output=reverse(s);
        System.out.println(output);
	   
	}
	
	public static String reverse(String input) {
        if (input.isEmpty()) {  
            return input;
        }
        String[] arr = input.split(" ",2);

        String firstWord = arr[0];
        String remainingSentence;
        
        if (arr.length == 2)
            remainingSentence = arr[1];
        else
            remainingSentence = "";
        return reverse(remainingSentence) + firstWord + " ";  
    }
}