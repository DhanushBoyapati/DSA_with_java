
 public class Main
{
    
    public static boolean myfun(int[] arr,int ind)
    {
        if(arr.length==0|| arr.length==1)
        {
            return true;
        }
        if(ind==arr.length-1)
        {
            return true;
        }
        
        if(arr[ind]>arr[ind+1])
        {
            return false;
        }
        
        
        return myfun(arr,ind+1);
    }
    
   public static void main(String[] arg)
   {
       
       int[] arr={1,2,3,4,5};
       
       int ind=0;
       
      boolean ans= myfun(arr,ind);
      if(ans==true)
      {
          System.out.println("array is sorrted");
      }
      
      else{
          System.out.print("array is not sorted");
      }
   }
}

