import java.util.*;


public class Main
{
    public static void myfun(int[] arr,int start,int end,int target)
    {
        if(start<=end)
        {
            int mid=(start+end)/2;
            if(arr.length==0||arr.length==1)
            {
                System.out.print("sorted becaues of 1 or 0 elements");
            }
            
            if(arr[mid]==target)
            {
                System.out.print("found");
            }
            
            else if (arr[mid]<=target)
            {
                start=mid+1;
                myfun(arr,start,end,target);
            }
            else{
                end=mid-1;
                myfun(arr,start,end,target);
            }
        }
        
        else{
            System.out.print("not found");
        }
    }
    
    
	public static void main(String[] args) {
	    
	   
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the array size: ");
	   int n=sc.nextInt();
	    int[] arr=new int[n];
	   System.out.print("enter the elements in array: ");
	   for(int i=0;i<n;i++)
	   {
	       arr[i]=sc.nextInt();
	   }
	    
	    int start=0;
	    int end=n-1;
	    System.out.print("enter the target value : ");
	    int target=sc.nextInt();
	    
	    myfun(arr,start,end,target);
	    
	    
	    
	}
}



// enter the array size: 6
// enter the elements in array: 1 2 3 4 5 6
// enter the target value : 6
// found
