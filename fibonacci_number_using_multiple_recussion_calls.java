
import java.util.*;
public class Main
{
    
    public static int myfun(int n)
    {
        if(n<=1)
        {
            return n;
            
        }
        
      int output=  myfun(n-1)+myfun(n-2);
      return output;
        
    }
    
    
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter number you want to find the fibo number : ");
	    int n=sc.nextInt();
	    
	   int output= myfun(n);
	   System.out.print("the fibo number at the "+n+" place is "+ output);

	    
	    
	}
}



// enter number you want to find the fibo number : 6
// the fibo number at the 6 place is 8
