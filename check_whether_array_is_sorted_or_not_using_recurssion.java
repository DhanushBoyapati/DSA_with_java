


public class Main
{
    public static void myfun(int[] arr,int i,int n)
    {
        if(i<=n-i)
        {
            int temp=arr[i];
            arr[i]=arr[n-i];
            arr[n-i]=temp;
            
             myfun(arr,i+1,n);
        }
        
    }
    
	public static void main(String[] args) {
	    
	    
	    int[] arr={1,2,3,4,5};
	    int n=arr.length-1;
	    
	    
	    int i=0;
	    myfun(arr,i,n);
	    for( int j=0;j<=n;j++)
	    {
	        System.out.print(arr[j]+" ");
	    }
	    
	}
}
