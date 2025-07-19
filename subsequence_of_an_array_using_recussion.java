import java.util.*;



public class Main
{
    
   public static void myfun(int ind,List<Integer> ans,int[] arr,int n)
   {
       if(ind>=n)
       {
           for(int num:ans)
           {
               System.out.print(num+" ");
           }
           System.out.println();
            return;

       }
       
       ans.add(arr[ind]);
       myfun(ind+1,ans,arr,n);
        
        ans.remove(ans.size() - 1);


       myfun(ind+1,ans,arr,n);
       
   }
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter the array size: ");
	    int n=sc.nextInt();
	    System.out.print("eneter the elements: ");
	    int[] arr=new int[n];
	    List<Integer> ans=new ArrayList<>();
	    for(int i=0;i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    int ind=0;
	    System.out.print("the output is: ");
	    myfun(ind,ans,arr,n);

	}
}



// enter the array size: 3
// eneter the elements: 3 1 2
// the output is: 3 1 2 
// 3 1 
// 3 2 
// 3 
// 1 2 
// 1 
// 2 
//[]
