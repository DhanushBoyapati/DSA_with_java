import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size of array ");
	    int n=sc.nextInt();
	    	    System.out.println("enter the window size ");

	    int k=sc.nextInt();
	    int arr[]=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    
	    int count=myfun(arr,k);
	    System.out.print("the count is "+ count);
	}
	
	static int myfun(int arr[],int k)
	{ int c=0;
	    for(int i=0;i<=arr.length-k;i++)
	    {
	        boolean isin=true;
	        
	        for(int j=i;j<i+k-1;j++)
	        {
	            if(arr[j]>=arr[j+1])
	            {
	                isin=false;
	                break;
	            }
	        }
	        if(isin)
	        {
	            c++;
	        }
	    }
	    return c;
	}
}