
//demonstration of working of static keyword
public class Main
{
    //static variable
		static int n=50;
		
		static{
		    System.out.println("from Static block");
		}
		
		int num=90;//non static variable
		
		static void workingofstatic()
		{
		    System.out.println("from static method");
		    n=100;
		    System.out.println("updated value of n="+n);
		   
		    //add(n,num);//shows error non-static variable num cannot be referenced from a static context
		    add(n,n);
		}
    
        public static void add(int a,int b) 
        {
            System.out.println("from static add method");
            System.out.println(a+b);
        }
        
       
	public static void main(String[] args) {
	     
		System.out.println("Demonstration of static block,variable,method is provided");
		workingofstatic();
		
	}
}